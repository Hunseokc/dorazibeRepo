package ThisIsJava.ch12.test.t8;

public class TimeAvg {
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        int[] scores = new int[1000];
        for (int i=0;i<scores.length;i++) {
            scores[i] = i;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double avg = sum / scores.length;
        System.out.println(avg);

        long endTime = System.nanoTime();
        long result = endTime-startTime;
        System.out.println("소요 시간 : " + result);
    }
}
