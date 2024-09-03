package ThisIsJava.ch08.sec05;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV off");
    }

    @Override
    public void setVol(int volume) {
        if (volume> RemoteControl.MAX_VOL) {
            this.volume = RemoteControl.MAX_VOL;
        } else if (volume< RemoteControl.MIN_VOL) {
            this.volume = RemoteControl.MIN_VOL;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);
    }
}
