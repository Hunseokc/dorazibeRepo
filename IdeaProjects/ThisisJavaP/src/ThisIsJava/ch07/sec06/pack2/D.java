package ThisIsJava.ch07.sec06.pack2;

import ThisIsJava.ch07.sec06.pack1.A;

public class D extends A {

    public D () {
        super();
    }

    public void method2 () {
        this.field = "field";
        super.method();
    }
}
