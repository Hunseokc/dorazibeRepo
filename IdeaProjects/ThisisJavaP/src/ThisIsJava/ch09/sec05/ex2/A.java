package ThisIsJava.ch09.sec05.ex2;

public class A {
    String field = "A-field";

    void method() {
        System.out.println("A-method");
    }

    class B {
        String field = "B-field";

        void method() {
            System.out.println("B-method");
        }

        void print() {
            System.out.println(this.field);
            this.method();

            System.out.println(A.this.field);
            A.this.method();
        }
    }

    void usbB() {
        B b = new B();
        b.print();
    }
}
