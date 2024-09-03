package ThisIsJava.ch09.sec04.ex3;

public class A {
    public void method1(int arg) {
        int var = 1;  // final int var = 1;

        class B {
            void method2()  {
                System.out.println("arg : " + arg);
                System.out.println("var : " + var);
                /*
                불가능한 작업
                arg = 2;
                var = 2;
                */
            }
        }

        B b = new B();
        b.method2();
    }
}
