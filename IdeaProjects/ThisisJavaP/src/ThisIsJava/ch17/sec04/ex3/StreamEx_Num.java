package ThisIsJava.ch17.sec04.ex3;

import java.util.stream.IntStream;

public class StreamEx_Num {
    public static int sum;
    public static int sum2;

    public static void main(String[] args) {
        IntStream intStream1 = IntStream.range(1, 100);
        intStream1.forEach( a -> sum += a);
        System.out.println("range 총합 : " + sum);
        // 4950

        IntStream intStream2 = IntStream.rangeClosed(1, 100);
        intStream2.forEach( a -> sum2 += a);
        System.out.println("rangeClose 총합 : " + sum2);
        // 5050
    }
}
