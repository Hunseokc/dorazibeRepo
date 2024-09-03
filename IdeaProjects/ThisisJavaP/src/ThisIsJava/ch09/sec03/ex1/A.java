package ThisIsJava.ch09.sec03.ex1;

public class A {
    // 인스턴스 멤버 클래스 선언
    static class B {}

    // 인스턴스 필드 (B type) = B 객체
    B field1 = new B();

    // 정적 필드 = B 객체 대입 (이건 이제 A 클래스 거쳐서 접근 가능)
    static B field2 = new B();

    // 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method1() {
        B b = new B();
    }

    // 정적 메소드
    static void method2() {
        B b = new B();
    }
}
