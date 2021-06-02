import java.util.ArrayList;
import java.util.Scanner;

public class LeeStack {
    //후입 선출
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
        ArrayList<Integer> stack = new ArrayList<Integer>(); // 리스트 객체 생성
        while(cnt < inputNum){ // 몇 회 입력할건지 조건
            String inputAct = UserInput.nextLine(); // 유저 입력
            if(inputAct.contains("push")){  // 유저입력 안에 push가 있는지 체크
                String stackIn = inputAct.substring(5);
                stack.add(Integer.valueOf(stackIn));
                pushCnt++;
                cnt++;
            }
            switch (inputAct){
                //스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "pop":
                    if(stack.size() == 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.get(pushCnt - 1));
                        stack.remove(pushCnt - 1);
                    }
                    cnt++;
                    break;
                //스택에 들어있는 정수의 개수를 출력한다.
                case "size":
                    System.out.println(stack.size());
                    cnt++;
                    break;
                //스택이 비어있으면 1, 아니면 0을 출력한다.
                case "empty":
                    if(stack.size() == 0){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    cnt++;
                    break;
                // 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "top":
                    if(stack.size() == 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.get(stack.size() - 1));
                    }
                    cnt++;
                    break;
            }
        }
    }
}
