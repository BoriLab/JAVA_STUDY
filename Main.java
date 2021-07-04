import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner plateInput = new Scanner(System.in);
        Hanoi hanoiTop = new Hanoi();
        //원판의 수 입력
        System.out.print("원판 수를 입력하시오 : ");
        int plate = plateInput.nextInt();
        System.out.println("원판의 이동횟수 : " + (int)(Math.pow(2,plate)-1));//하노이탑의 이동횟수 식은 2^n - 1
        hanoiTop.hanoiSearch(plate, 1, 2,3);

        //--------------------------------------------------------
        /*int node1 = plateInput.nextInt();
        int node2 = plateInput.nextInt();
        int node3 = plateInput.nextInt();
        int node4 = plateInput.nextInt();
        int node5 = plateInput.nextInt();
        int node6 = plateInput.nextInt();
        int node7 = plateInput.nextInt();
        int node8 = plateInput.nextInt();
        int node9 = plateInput.nextInt();
        BinaryTree BiTree = new BinaryTree();*/
    }
}
