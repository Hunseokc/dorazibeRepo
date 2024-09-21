package ThisIsJava.ch12.test.t11;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";
        StringTokenizer sT = new StringTokenizer(str, ",");

        while (sT.hasMoreTokens()) {
            String token = sT.nextToken();
            System.out.println(token);
        }
    }
}
