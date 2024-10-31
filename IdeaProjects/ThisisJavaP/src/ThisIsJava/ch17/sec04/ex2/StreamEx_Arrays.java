package ThisIsJava.ch17.sec04.ex2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx_Arrays {
    public static void main(String[] args) {
        // 배열 생성
        String[] strArray = { "홍길동", "신용권", "김미나"};
        // 배열에 대한 스트림 생성
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        int[] intArray = { 1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach( item -> System.out.print(item + ", "));
    }
}
