package ThisIsJava.ch09.sec02.ex1;

public class AEx {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();
    }
}
