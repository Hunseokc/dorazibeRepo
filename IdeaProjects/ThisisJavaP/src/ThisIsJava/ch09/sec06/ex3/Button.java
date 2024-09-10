package ThisIsJava.ch09.sec06.ex3;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    // 인터페이스의 구현 객체 선택
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // 구현 객체의 onClick 메소드 실행
    public void click() {
        this.clickListener.onClick();
    }
 }
