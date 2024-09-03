package ThisIsJava.ch07.sec02;

public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy", "black");

        System.out.println("모델 : " + smartPhone.model);
        System.out.println("색상 : " + smartPhone.color);
        System.out.println("와이파이 상태 : " + smartPhone.wifi);

        smartPhone.bell();
        smartPhone.sendVoice("hi");
        smartPhone.receiveVoice("by");
        smartPhone.hangUp();

        smartPhone.setWifi(true);
        smartPhone.internet();
    }
}
