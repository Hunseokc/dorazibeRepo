package ThisIsJava.ch17.test.t6;

import java.util.Arrays;
import java.util.List;

public class Ex_average_in_List {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double avg = list.stream()
                .mapToInt(s->s.getAge())
                .average()
                .getAsDouble();
        System.out.println("평균 나이 : " + avg);
    }
}
