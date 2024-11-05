package ThisIsJava.ch17.sec12.ex2;

import ThisIsJava.ch17.sec12.ex1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("김지비", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        Map<String, List<Student>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s->s.getSex())
                );

        List<Student> maleList = map.get("남");
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();
    }
}
