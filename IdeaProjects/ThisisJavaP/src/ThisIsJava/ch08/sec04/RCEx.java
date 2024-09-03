package ThisIsJava.ch08.sec04;

public class RCEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVol(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVol(5);
        rc.turnOff();
    }
}
