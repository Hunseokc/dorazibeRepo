package ThisIsJava.ch16.test.t5;

public class Ex {
    public static void main(String[] args) {
        Button btn0k = new Button();
        btn0k.setClickListener( () -> {
            System.out.println("OK 버튼 클릭");
        });
        btn0k.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener( () -> {
            System.out.println("Cancel 버튼 클릭");
        });
        btnCancel.click();
    }
}
