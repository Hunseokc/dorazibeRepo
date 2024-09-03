package ThisIsJava.ch04.test;

public class test2_switchexp {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = 0;
        switch (grade) {
            case "A", "a" -> {
                score1 = 100;
                break;
            }
            case "B", "b" -> {
                int result = 100 - 20;
                score1 = result;
                break;
            }
            default -> score1 = 60;
        }
        System.out.println(score1);
    }
}
