package ThisIsJava.ch09.sec07.ex2;

public class Home {
    // RemoteControl 타입 필드 rc 정의하면서 대입
    private RemoteControl rc =  new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV on");
        }

        @Override
        public void turnOff() {
            System.out.println("TV off");
        }
    };

    // 정의된 필드 rc에 대한 메소드 정의
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드 정의
    public void use2() {
        // 로컬 변수 rc에 익명 객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 on");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 off");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // 매개변수로 객체를 삽입해 자동 타입 변환 시켜 다형성 확보
    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
