package ThisIsJava.ch08.sec11.ex1;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new KHTire();
        myCar.tire2 = new KHTire();

        myCar.run();
    }
}
