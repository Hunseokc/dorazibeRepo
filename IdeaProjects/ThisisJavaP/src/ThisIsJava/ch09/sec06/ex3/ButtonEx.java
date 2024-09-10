package ThisIsJava.ch09.sec06.ex3;

public class ButtonEx {
    public static void main(String[] args) {
        Button btn0k = new Button();

        // Button 클래스의 중첩 인터페이스의 implements(구현) 객체 OkListener
        class OkListener implements Button.ClickListener {
        @Override
            // ClickListener 인터페이스에서 정의한 추상 메소드 오버라이딩
            public void onClick() {
            System.out.println("OK 버튼 클릭");
            }
        }
        // 중첩 인터페이스에 접근해서 구현 객체 선택 -> OkL
        btn0k.setClickListener(new OkListener());

        // 구현 객체에서 오버라이딩한(위에서) click 메소드 실행
        btn0k.click();

        // ----------------------------------------

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭");
            }
        }

        // 인터페이스 ClickListener의 구현 클래스 설정
        // (자동 타입 변환을 통해 삽입)
        btnCancel.setClickListener(new CancelListener());

        // 인터페이스의 구현 객체의 메소드 호출
        btnCancel.click();
    }
}
