package ThisIsJava.ch12.sec03.ex2;

public class HashCodeEx {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");


        System.out.println(s1);
        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("동등 객체");
            } else {
                System.out.println("데이터가 달라 동등 X");
            }
        } else {
            System.out.println("해시코드가 달라 동등 X");
        }
    }
}
