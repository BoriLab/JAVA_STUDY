import java.util.ArrayList;
import java.util.Scanner;

public class Que{
    //선입 선출
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        int cnt = 0; // total Count
        int pushCnt = 0; //push Count & top stack
        // 1 < n < 10000
        int inputNum = UserInput.nextInt();
        if((10000 < inputNum) || (inputNum < 1)){
            return;
        }

        //반복
        ArrayList<Integer> stack = new ArrayList<Integer>();
        while(cnt < inputNum){
            String inputAct = UserInput.nextLine();
            if(inputAct.contains("push")){
                String stackIn = inputAct.substring(5); // 인덱스 5번부터 끝까지 짤라서 가져온다.
                stack.add(Integer.valueOf(stackIn)); // 문자열 입력 Integer로 변경후 저장
                pushCnt++; // push한 갯수 추가
                cnt++; // 명령 수 조정
            }
            switch (inputAct){
                //큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "pop":
                    if(stack.size() == 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.get(0));
                        stack.remove(0);
                    }
                    cnt++;
                    break;
                //큐에 들어있는 정수의 개수를 출력한다.
                case "size":
                    System.out.println(stack.size());
                    cnt++;
                    break;
                //큐가 비어있으면 1, 아니면 0을 출력한다.
                case "empty":
                    if(stack.size() == 0){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    cnt++;
                    break;
                //큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "front":
                    if(stack.size() == 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.get(0));
                    }
                    cnt++;
                    break;
                //큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "back":
                    if(stack.size() == 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.get(pushCnt - 1));
                    }
                    cnt++;
                    break;
            }
        }
    }
}
