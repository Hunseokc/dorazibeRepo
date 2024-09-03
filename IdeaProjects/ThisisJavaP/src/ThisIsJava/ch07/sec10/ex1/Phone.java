package ThisIsJava.ch07.sec10.ex1;

public abstract class Phone {
    String owner;

    public Phone (String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("전원 온");
    }
    void turnOff() {
        System.out.println("전원 오프");
    }
}
