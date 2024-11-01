package ThisIsJava.ch17.sec08;

import java.util.Arrays;

public class LoopingEx {
    public static void main(String[] args) {
        int[] intArr = { 1,2,3,4,5 };

        // 루핑 메소드를 잘못 선택한 경우 -> 아무 동작 X (에러도 X)
        Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .peek(n-> System.out.println());

        // 중간 처리로 peek 사용
        int total = Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .peek(n -> System.out.println(n))
                .sum();   // sum은 합을 반환하는 최종 처리
        System.out.println("총합 : " + total + "\n");

        // 최종 처리로 forEach 사용
        Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .forEach(n -> System.out.println(n));
        System.out.println();
    }
}
