package ThisIsJava.ch17.sec12.ex3;

import ThisIsJava.ch17.sec12.ex1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx_groupingBy_2nd_parameter {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김지비", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s->s.getSex(),
                                Collectors.averagingDouble(s->s.getScore())
                        )
                );

        System.out.println(map);
    }
}
