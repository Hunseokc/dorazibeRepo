package ThisIsJava.ch12.test.t6;

public class Member {
    private String id;
    private String name;

    public Member (String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 객체만 딸랑 print 메소드에 넣으면 toString 실행
    @Override
    public String toString() {
        String result = id + ": " + name;
        return result;
    }
}
