import java.util.ArrayList;
import java.util.Scanner;

public class CapStack {
    public ArrayList<Integer> stack = new ArrayList<Integer>();
    public Scanner UserInput = new Scanner(System.in);
    public int cnt; // total Count
    public int pushCnt; //push Count & top stack
    //함수 구현 pop size empty top
    public void push(String inputAct){
        if(inputAct.contains("push")){
            String stackIn = inputAct.substring(5);
            stack.add(Integer.valueOf(stackIn));
            pushCnt++;
            cnt++;
        }
    }
    public void pop(){
        if(stack.size() == 0){
            System.out.println(-1);
        }else{
            System.out.println(stack.get(pushCnt - 1));
            stack.remove(pushCnt - 1);
        }
        cnt++;
    }

    public void size(){
        System.out.println(stack.size());
        cnt++;
    }
    public void top(){
        if(stack.size() == 0){
            System.out.println(-1);
        }else{
            System.out.println(stack.get(stack.size() - 1));
        }
        cnt++;
    }
    public void empty(){
        if(stack.size() == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        cnt++;
    }
    public static void main(String []args){
        CapStack Main1 = new CapStack();
        Main1.cnt = 0;
        Main1.pushCnt = 0;
        int inputNum = Main1.UserInput.nextInt();
        if((10000 < inputNum) || (inputNum < 1)){
            return;
        }
        while(Main1.cnt < inputNum){
            String inputAct = Main1.UserInput.nextLine();
            Main1.push(inputAct);

            switch (inputAct){
                case "pop":
                    Main1.pop();
                    break;
                case "size":
                    Main1.size();
                    break;
                case "empty":
                    Main1.empty();
                    break;
                case "top":
                    Main1.top();
                    break;
                }
            }
        }
    }

