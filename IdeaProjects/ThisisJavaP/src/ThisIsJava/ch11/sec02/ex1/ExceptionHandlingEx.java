package ThisIsJava.ch11.sec02.ex1;

public class ExceptionHandlingEx {
    public static void printLenngth(String data) {
        int result = data.length();
        System.out.println("입력값 문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLenngth("ThisIsJava");
        printLenngth(null);
        System.out.println("프로그램 종료");
    }
}
