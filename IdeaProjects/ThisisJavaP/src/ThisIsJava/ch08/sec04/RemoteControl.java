package ThisIsJava.ch08.sec04;

public interface RemoteControl {
    int MAX_VOL = 10;
    int MIN_VOL = 0;

    void turnOn();
    void turnOff();
    void setVol(int volume);
}
