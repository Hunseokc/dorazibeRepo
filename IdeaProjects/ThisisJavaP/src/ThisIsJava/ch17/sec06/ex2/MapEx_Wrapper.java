package ThisIsJava.ch17.sec06.ex2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapEx_Wrapper {
    public static void main(String[] args) {
        int[] intarr = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intarr);
        intStream
                .asDoubleStream()  // Double로 전환
                .forEach(d -> System.out.println(d));
        System.out.println();

        intStream = Arrays.stream(intarr);
        intStream
                .boxed()   // 래핑
                .forEach(obj -> System.out.println(obj.intValue()));
                    // 이제 객체라서 .intvalue 메소드로 값 호출
    }
}
