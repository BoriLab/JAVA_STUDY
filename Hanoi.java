import java.util.ArrayList;

public class Hanoi {
    int cnt = 0;
    // 원판의수와 첫기둥/ 목적지인 세번째 기둥/ 두번째 기둥
    public void hanoiSearch(int plate, int first, int second, int third){
        //원판의 수가 1인경우
        if(plate == 1){
            System.out.println(first + " " + third); //바로 3번째 기둥으로 이동
            return;
        }

        // 3번째 기둥으로 가기위해 일단 두번째 기둥으로 n-1개의 원판을 이동
        hanoiSearch(plate - 1, first, third, second);
        //1번째 기둥에 남은 원판 하나를 3번째 기둥으로 이동
        System.out.println(first + "１" + third);
        //n-1개를 B에서 C로 이동
        hanoiSearch(plate - 1, second, first, third);
    }
}