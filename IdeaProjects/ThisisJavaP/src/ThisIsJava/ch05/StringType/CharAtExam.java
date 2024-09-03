package ThisIsJava.ch05.StringType;

public class CharAtExam {
    public static void main(String[] args) {
        String ssn = "98110215";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1', '3':
                System.out.println("남자");
                break;
            case '2', '4':
                System.out.println("여자");
                break;
        }
    }
}
