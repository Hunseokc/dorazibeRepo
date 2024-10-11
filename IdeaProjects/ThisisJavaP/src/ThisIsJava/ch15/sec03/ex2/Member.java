package ThisIsJava.ch15.sec03.ex2;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public boolean equals(Object object) {
        // name, age가 같은 동등 객체라면 true
        if (object instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else { return false; }
    }
}
