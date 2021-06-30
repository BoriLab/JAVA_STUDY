import java.util.ArrayList;
import java.util.Scanner;

public class Black {


    //첫줄 입력 2개 카드의 개수, 최고합수
    //두번째 줄 입력 카드 수의 맞는 카드 수
    //주어진 카드의 3개의 조합 중 조건의 맞는 합 찾기
    //브루트 포스 알고리즘? 말이 알고리즘이지 사실 무식하게 모든경우를 다 대입하는 방법
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        //첫줄 입력
        System.out.print("카드 수, 최대 합 입력: ");
        int CardNum = userInput.nextInt();
        int MaxCnt = userInput.nextInt();
        userInput.nextLine();//입력 구분을 위해서 사용
        //두번째 줄 입력 리스트 사용
        ArrayList<Integer> ArrayNum = new ArrayList<Integer>();
        System.out.print("카드 숫자 입력: ");
        String arrayInput = userInput.nextLine();
        //배열에 집어넣기
        String[] numberArray = arrayInput.split(" ");
        //int 배열
        Integer[] intArray = new Integer[CardNum];
        //String > int화
        for(int i = 0; i < CardNum;i++){
            Integer change = Integer.valueOf(numberArray[i]);
            intArray[i] = change;
        }
        //세수의 합이 MAX치에 최대한 가까운 수를 구하라
        //>> Max치 - 세 수의 합이 최소값이 되는 수가 선택
        int Count_second = 1;
        int result_th = MaxCnt + 1; // 기준값
        int result = 0; // 결과 저장값.
        for(int cnt1 = 0; cnt1 < CardNum;cnt1++){
            for(int cnt2 = 0 + Count_second; cnt2 < CardNum;cnt2++){
                for(int cnt3 = 1 + Count_second; cnt3 < CardNum;cnt3++){
                    int total_sum = intArray[cnt1] + intArray[cnt2] + intArray[cnt3];
                    if(total_sum <= MaxCnt){
                        if(result_th > MaxCnt - total_sum){
                            result_th = MaxCnt - total_sum;
                            result = total_sum;
                        }
                    }

                }
            }
            Count_second++;
        }
        System.out.println("세 수의 최댓값 : " + result);
    }
}
