package ThisIsJava.ch16.sec05.ex3;

public class Person {
    public Member getMember1(Creatable1 creatable1) {
        String id = "winter";
        Member member = new Member(id);
        return member;
    }

    public Member getMember2(Creatable2 creatable2) {
        String id = "winter";
        String name = "한겨울";
        Member member = new Member(id, name);
        return member;
    }
}
