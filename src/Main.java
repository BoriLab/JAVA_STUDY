import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        BinaryT tree = new BinaryT();
        for(int i = 0; i < 9;i++){
            tree.insertNode(inputUser.nextInt());
        }
        tree.postorderTree(tree.rootNode);
    }
}
