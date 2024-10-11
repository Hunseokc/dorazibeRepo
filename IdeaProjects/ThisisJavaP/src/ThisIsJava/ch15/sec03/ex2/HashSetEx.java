package ThisIsJava.ch15.sec03.ex2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        // set의 equals는 name과 age가 같은지 확인해보고 동등 객체 여부 판단
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체 수 : " + set.size());
    }
}
