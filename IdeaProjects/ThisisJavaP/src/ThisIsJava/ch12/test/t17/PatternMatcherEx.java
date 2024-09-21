package ThisIsJava.ch12.test.t17;

import java.util.regex.Pattern;

public class PatternMatcherEx {
    public static void main(String[] args) {
        //String id = "Angel1004"; -> 가능
        String id = "5Angel1004";   // 불가능

        // 시작 알파벳 / 2부터 숫 or 알파벳 / 8~12자 / 알파벳 대소문자 모두 허용
        String regExp = "[a-zA-Z]\\w{8,12}";
        boolean isMatch = Pattern.matches(regExp, id);
        if (isMatch) {
            System.out.println("id로 사용 가능합니다");
        } else {
            System.out.println("id로 사용 불가능");
        }
    }
}
