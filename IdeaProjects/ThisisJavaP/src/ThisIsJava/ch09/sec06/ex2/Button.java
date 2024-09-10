package ThisIsJava.ch09.sec06.ex2;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    // 필드 (인터페이스 변수)
    private ClickListener clickListener;

    // 메소드
    public void setClickListener (ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
