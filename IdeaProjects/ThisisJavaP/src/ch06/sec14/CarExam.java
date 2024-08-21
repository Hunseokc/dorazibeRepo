package ch06.sec14;

public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("현재 속도 : "+myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도 : "+myCar.getSpeed());

        // Car 클래스에서 stop 초기화 X -> False 상태
        // !isStop == True
        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도 : "+myCar.getSpeed());
    }
}
