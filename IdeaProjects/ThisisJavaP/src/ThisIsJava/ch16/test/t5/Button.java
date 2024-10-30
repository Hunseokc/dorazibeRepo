package ThisIsJava.ch16.test.t5;

public class Button {
    @FunctionalInterface
    public static interface ClickListener {
        // 함수형 인터페이스 -> 구현 객체로 람다식 가능
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    public void click() {
        this.clickListener.onClick();
    }
}
