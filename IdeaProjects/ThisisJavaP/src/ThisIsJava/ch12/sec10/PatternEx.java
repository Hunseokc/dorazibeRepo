package ThisIsJava.ch12.sec10;

import java.util.regex.Pattern;

public class PatternEx {
    public static void main(String[] args) {
        // java가 "" 내부에서 \을 인식하기 위해 두 번 사용
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식 불일치");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        //data = "dorazibe02@gmail.com";
        data = "dorazibe02@naver.co.kr";
        result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식 불일치");
        }
    }
}
