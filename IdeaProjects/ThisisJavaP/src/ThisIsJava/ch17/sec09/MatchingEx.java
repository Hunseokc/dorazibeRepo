package ThisIsJava.ch17.sec09;

import java.util.Arrays;

public class MatchingEx {
    public static void main(String[] args) {
        int[] intArr = { 2, 4, 6 };

        boolean result = Arrays.stream(intArr)
                .allMatch(a -> a%2==0);
        System.out.println("모두 2의 배수인가? "+ result);

        result = Arrays.stream(intArr)
                .anyMatch(a -> a%3 ==0);
        System.out.println("3의 배수가 존재하는가? "+ result);

        result = Arrays.stream(intArr)
                .noneMatch(a -> a%3==0);
        System.out.println("3의 배수가 없는가? " + result);
    }
}
