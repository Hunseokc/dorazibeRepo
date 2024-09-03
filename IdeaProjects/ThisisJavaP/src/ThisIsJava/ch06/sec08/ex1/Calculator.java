package ThisIsJava.ch06.sec08.ex1;

public class Calculator {
    void powerOn() {
        System.out.println("전원 ON");
    }
    void powerOff() {
        System.out.println("전원 OFF");
    }
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }
}
