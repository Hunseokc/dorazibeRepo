package ThisIsJava.ch11.test.t7;

public class NotExistIDException  extends Exception{
    // 사용자 정의 예외처리

    // 기본 생성자
    public NotExistIDException() {}

    // 에러 메시지를 전달받는 생성자
    public NotExistIDException(String message) {
        super(message);
    }
}
