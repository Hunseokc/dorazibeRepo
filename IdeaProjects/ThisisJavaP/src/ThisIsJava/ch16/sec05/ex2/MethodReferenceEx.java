package ThisIsJava.ch16.sec05.ex2;

public class MethodReferenceEx {
    public static void main(String[] args) {
        Person person = new Person();
        // ordering을 통해 매개변수와 결과에 대한 제어를 제공한다
        // 단, 비교는 String 클래스의 메소드를 참조하여 시행
        person.ordering( String :: compareToIgnoreCase );
    }
}
