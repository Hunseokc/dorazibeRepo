package ThisIsJava.ch13.sec02.ex2;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
