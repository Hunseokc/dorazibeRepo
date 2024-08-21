package ch05.Array;

public class AdvancedForExam {
    public static void main(String[] args) {
        int[] scores = { 95, 71, 84};
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        System.out.println(sum);

        double avg = (double) sum / scores.length;
        System.out.print("평균 : ");
        System.out.printf("%.4f", avg);
    }
}
