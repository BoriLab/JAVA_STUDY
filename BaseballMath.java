import java.util.Scanner;

public class BaseballMath {

    public static void main(String[] args){
        //입력 몇번 질문 할건지
        //
        Scanner Input = new Scanner(System.in);

        //질문의 수
        int question = Input.nextInt();

        Input.nextLine();
        //가능성 카운트
        int result = 0;
        //가능성이 있는 답의 총개수
        //가능성이 있다고 판단되는 것은 볼과 스트라이크를 합쳐서 2이상이 되는 경우 가능성 있다고 판단.
        for(int i = 0;i < question;i++){
            //숫자, 스트라이크인지 볼인지
            int baseball = Input.nextInt();
            int strike = Input.nextInt();
            int ball = Input.nextInt();
            if(strike + ball >= 2){
                result++;
            }
        }
        System.out.println(result);
    }
}
