package ThisIsJava.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        /* 한 줄씩 작성
        Stream<Student> stream = list.stream();
        IntStream scoreStream = stream.mapToInt(Student -> Student.getScore());
        double avg = scoreStream.average().getAsDouble();
        */

        // 메소드 체이닝
        double avg = list.stream()
                .mapToInt( student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 점수 : " + avg);
    }
}
