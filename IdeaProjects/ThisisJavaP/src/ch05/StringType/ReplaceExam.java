package ch05.StringType;

public class ReplaceExam {
    public static void main(String[] args) {
        String oldStr = "자바 문자열 자바임";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
