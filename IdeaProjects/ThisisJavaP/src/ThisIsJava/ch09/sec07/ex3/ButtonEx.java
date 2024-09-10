package ThisIsJava.ch09.sec07.ex3;

public class ButtonEx {
    public static void main(String[] args) {
        Button btn0k = new Button();

        btn0k.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼 클릭");
            }
        });
        btn0k.click();
        // ----------------------------------------

        Button btnCancel = new Button();

        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭");
            }
        });

        btnCancel.click();
    }
}
