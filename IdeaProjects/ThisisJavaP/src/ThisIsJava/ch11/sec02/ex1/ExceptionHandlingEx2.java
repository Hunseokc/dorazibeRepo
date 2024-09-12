package ThisIsJava.ch11.sec02.ex1;

public class ExceptionHandlingEx2 {
    public static void printLenngth(String data) {
        try {
            int result = data.length();
            System.out.println("입력값 문자 수 : " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
            //e.printStackTrace();
        } finally {
            System.out.println("마무리 실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLenngth("ThisIsJava");
        printLenngth(null);
        System.out.println("프로그램 종료");
    }
}
