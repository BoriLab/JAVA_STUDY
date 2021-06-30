import java.util.Scanner;

public class Fact {
    public static void main(String[]args){
        Scanner user = new Scanner(System.in);

        //유저입력
        System.out.print("0~12사이의 정수를 입력하시오: ");
        int number = user.nextInt();
        int result = 1;
        for(int i = 1; i<=number;i++){
            result *= i;
        }
        System.out.println("-------------------");
        System.out.println("결과: " + result);
        System.out.println("-------------------");
    }
}
