package ThisIsJava.ch09.test.t4;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car.Tire tire = myCar.new Tire();
        Car.Engine engine = new Car.Engine();
    }
}
