package ThisIsJava.ch07.sec02;

public class SmartPhone extends Phone{
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 변경");
    }
    public void internet() {
        System.out.println("인터넷 연결");
    }
}
