package ThisIsJava.ch08.sec12;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus run");
    }

    public void checkFare() {
        System.out.println("요금 체크");
    }
}
