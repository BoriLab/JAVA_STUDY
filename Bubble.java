import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    //수열에 대해서 버블 소트를 수행할 때, Swap이 총 몇 번


    public static void main(String [] args){
        //입력 받은 갯수 만큼 배열 크기 생성 혹 배열 집어넣기.
        Scanner scan = new Scanner(System.in);

        //몇 개의 배열을 입력받을지
        int count = scan.nextInt();
        scan.nextLine();
        System.out.println("---------------------------------");
        String arrayInput = scan.nextLine();
        //배열에 넣기위해 스플릿
        String[] bubbleArray = arrayInput.split(" ");
        //버블 정렬 int화
        Integer[] intBubbleArray= new Integer[count];
        for(int i = 0;i < count;i++){
            Integer change = Integer.valueOf(bubbleArray[i]);
            intBubbleArray[i] = change;
        }
        //버블 정렬 스왑(반복)
        int swapCnt = 0; //반복횟수
        int checkCnt = 0; //정렬 확인 횟수
        while(checkCnt < count - 1 ){
            checkCnt = 0;
            for(int swap = 0; swap < intBubbleArray.length - 1;swap++){
                int temp = intBubbleArray[swap];
                if(intBubbleArray[swap] > intBubbleArray[swap + 1]){
                    intBubbleArray[swap] = intBubbleArray[swap + 1];
                    intBubbleArray[swap + 1] = temp;
                    swapCnt++;
                }else if(intBubbleArray[swap] < intBubbleArray[swap +1]){
                    checkCnt++;
                }

            }
        }
        System.out.println(Arrays.toString(intBubbleArray));//정렬 확인
        System.out.println(swapCnt);//몇번 스왑했는지
    }
    }


