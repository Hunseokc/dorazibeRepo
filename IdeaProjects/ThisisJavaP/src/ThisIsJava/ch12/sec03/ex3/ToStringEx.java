package ThisIsJava.ch12.sec03.ex3;

public class ToStringEx {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("apple", "ios");

        String strObj = sp.toString();
        System.out.println(strObj);

        System.out.println(sp);
    }
}
