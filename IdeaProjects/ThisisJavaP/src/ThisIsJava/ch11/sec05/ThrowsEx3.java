package ThisIsJava.ch11.sec05;

public class ThrowsEx3 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (Exception e) {
            System.out.println("예외 처리 : "+ e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
