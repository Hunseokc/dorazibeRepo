package ThisIsJava.ch16.sec02.ex2;

public class ButtonEx {
    public static void main(String[] args) {
        Button btn0k = new Button();

        btn0k.setClickListener( () -> {
            System.out.println("OK 버튼 클릭");
        });
        btn0k.click();

        Button btnCancel = new Button();

        btn0k.setClickListener( () -> {
            System.out.println("Cancel 버튼 클릭");
        });
        btn0k.click();
        /*
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭");
            }
        }
        */
    }
}
