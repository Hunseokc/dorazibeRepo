package ThisIsJava.ch09.sec07.ex1;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();
        car.run2();

        // 익명 자식 객체가 대입된 매개변수 사용
        // 매개변수로 대입할 익명 자식 객체를 대입하면서 정의
        car.run3(new Tire(){
            @Override
            public void roll() {
            System.out.println("익명 자식 tire 객체 3 roll");
        }
        });

    }
}
