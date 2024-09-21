package ThisIsJava.ch12.sec04;

public class ErrEx {
    public static void main(String[] args) {
        System.err.println("에러 상황 의도적 발생");
        try{
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
    }
}
