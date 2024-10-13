package ThisIsJava.ch16.sec02.ex2;

public class Button {
    @FunctionalInterface
    public static interface ClickListener {
        // 추상 메소드 1개 = 함수형 인터페이스
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메소드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
