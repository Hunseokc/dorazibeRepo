package ch05.StringType;

public class IndexOfContainsExam {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");      // 위치 찾기
        System.out.println(location);
        String substring = subject.substring(location); // 잘라내기
        System.out.println(substring);

        location = subject.indexOf("자바");
        if(location != -1) {
            System.out.println("자바 관련 과목");
        } else {
            System.out.println("자바와 무관한 과목");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바 관련 과목");
        } else {
            System.out.println("자바와 무관한 과목");
        }
    }
}
