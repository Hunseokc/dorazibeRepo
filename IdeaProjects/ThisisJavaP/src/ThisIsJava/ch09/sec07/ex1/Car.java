package ThisIsJava.ch09.sec07.ex1;

public class Car {
    private Tire tire1 = new Tire();

    // 필드에 익명 자식 객체 대입
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 tire 객체 1 roll");
        }
    };

    // 메소드 (필드 이용)
    public void run1(){
        tire1.roll();   // Tire 클래스의 메소드 그대로 사용
        tire2.roll();   // 위 필드에 익명 자식 객체 대입 시 재정의한 메소드 사용
    }

    // 메소드 (로컬 변수 이용)
    public void run2() {
        // 위에서 정의된 로컬 변수에 익명 자식 객체 대입
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 tire 객체 2 roll");
            }
        };
        tire.roll();
    }

    // 메소드 (매개변수 이용)
    public void run3(Tire tire) {
        tire.roll();
    }
}
