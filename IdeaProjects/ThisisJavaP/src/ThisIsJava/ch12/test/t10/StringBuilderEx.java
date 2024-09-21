package ThisIsJava.ch12.test.t10;

public class StringBuilderEx {
    public static void main(String[] args) {
        // String str = "";
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i <= 100; i++) {
            str.append(i);
        }
        System.out.println(str);
    }
}
