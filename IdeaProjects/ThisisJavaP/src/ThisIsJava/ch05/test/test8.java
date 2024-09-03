package ThisIsJava.ch05.test;

public class test8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int result = 0;
        int cnt = 0;
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j];
                ++cnt;
            }
        }
        avg = (double)result / cnt;
        System.out.println("총합 : " + result);
        System.out.println("평균 : " + avg);
    }
}
