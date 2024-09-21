package ThisIsJava.ch12.test.t9;

public class DecodingEx {
    public static void main(String[] args) throws Exception {
        byte[] bytes = { -20, -107, -120, -21, -123, -107 };
        String str = new String(bytes);
        System.out.println("str : " + str);
    }
}
