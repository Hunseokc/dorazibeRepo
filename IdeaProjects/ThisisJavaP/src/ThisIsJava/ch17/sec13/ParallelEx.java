package ThisIsJava.ch17.sec13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelEx {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> scores = new ArrayList<>();
        for (int i=0; i<1000000000; i++) {
            scores.add(random.nextInt(101));
        }

        double avg = 0.0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;

        // 일반 스트림 처리
        Stream<Integer> stream = scores.stream();
        startTime = System.nanoTime();
        avg = stream
                .mapToInt(i -> i.intValue())  // 래핑 값 꺼내기
                .average()            // 평균내기(optional 객체로 리턴)
                .getAsDouble();       // 값 꺼내기
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg : " + avg + ", 일반 스트림 처리 시간 : " + time + "ns");

        // 병렬 스트림 처리
        Stream<Integer> parallelStream = scores.parallelStream();
        startTime = System.nanoTime();
        avg = parallelStream
                .mapToInt(i -> i.intValue())  // 래핑 값 꺼내기
                .average()            // 평균내기(optional 객체로 리턴)
                .getAsDouble();       // 값 꺼내기
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg : " + avg + ", 병렬 스트림 처리 시간 : " + time + "ns");
    }
}
