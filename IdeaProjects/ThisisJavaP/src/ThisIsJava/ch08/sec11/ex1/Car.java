package ThisIsJava.ch08.sec11.ex1;

public class Car {
    Tire tire1 = new HKTire();
    Tire tire2 = new HKTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }
}
