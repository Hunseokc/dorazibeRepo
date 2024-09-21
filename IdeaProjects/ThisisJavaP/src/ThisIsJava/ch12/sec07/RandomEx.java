package ThisIsJava.ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        int[] selectNum = new int[6]; // 6칸 정수 배열 생성
        Random random = new Random(3);  // seed 3인 난수 객체 생성
        System.out.print("선택번호 : ");
        for(int i=0; i<6; i++) {
            selectNum[i] = random.nextInt(45) + 1; // 1 ~ 45 정수값 리턴
            System.out.print(selectNum[i] + " ");
        }
        System.out.println();

        int[] winningNum = new int[6];
        Random random2 = new Random(5);
        System.out.print("당첨번호 : ");
        for(int i=0; i<6; i++) {
            winningNum[i] = random2.nextInt(45) + 1; // 1 ~ 45 정수값 리턴
            System.out.print(winningNum[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNum);
        Arrays.sort(winningNum);
        boolean result = Arrays.equals(selectNum, winningNum);
        System.out.print("당첨여부 : ");
        if (result) {
            System.out.println("1등 당첨");
        } else {
            System.out.println("당첨 X");
        }
    }
}
