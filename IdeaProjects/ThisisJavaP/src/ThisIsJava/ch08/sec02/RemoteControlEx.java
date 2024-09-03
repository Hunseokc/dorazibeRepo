package ThisIsJava.ch08.sec02;

public class RemoteControlEx {
    public static void main(String[] args) {
        /*
        RemoteControl rc;
        rc = new Television();
         */

        RemoteControl rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
