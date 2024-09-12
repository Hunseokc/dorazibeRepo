package ThisIsJava.ch11.test.t7;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
