package ch04;

public class SwitchValueExam {
    public static void main(String[] args) {
        String grade = "B";

    int score = switch(grade){
        case "A" -> 100;
        case "B" -> {
            //int result = 100 - 30;
            //yield result;
            yield 70;
        }
        default -> 60;
    };
    System.out.println(score);
    }
}
