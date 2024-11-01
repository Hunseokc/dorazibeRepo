package ThisIsJava.ch17.sec10;

import java.util.Arrays;

public class AggregateEx {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};

        long count = Arrays.stream(arr)
                .filter(n -> n%2==0) // 2의 배수만
                .count();            // 개수 세기
        // count()는 long 형을 반환해서 get 메소드 X
        System.out.println("2의 배수의 개수 : " + count);

        long sum = Arrays.stream(arr)
                .filter(n -> n%2==0)
                .sum();
        // sum()은 int long double 형을 반환해서 get 메소드 X
        System.out.println("2의 배수들의 합 : " + sum);

        double avg = Arrays.stream(arr)
                .filter(a -> a%2==0)
                .average()
                .getAsDouble();
        // average()는 OptinalDouble로 반환하기 때문에
        // getAsDouble을 통해 값으로 처리 필요
        System.out.println("2의 배수의 평균 : " + avg);

        int max = Arrays.stream(arr)
                .filter(n->n%2==0)
                .max()
                .getAsInt();
        System.out.println("최대값 : " + max);

        int min = Arrays.stream(arr)
                .filter(n -> n%2==0)
                .min()
                .getAsInt();
        System.out.println("최소값 : " + min);

        int first = Arrays.stream(arr)
                .filter(n -> n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("배열 중 첫 3의 배수 : " + first);
    }
}
