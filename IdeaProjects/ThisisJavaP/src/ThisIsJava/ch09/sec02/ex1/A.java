package ThisIsJava.ch09.sec02.ex1;

public class A {
    class B {}

    // B 타입 변수 field에 B 객체 삽입
    B field = new B();

    // 생성자
    A() {
        B b = new B();
    }

    void method() {
        B b = new B();
    }
}
