package ch05.Array;

public class ArrayCreateByNewExam {
    public static void main(String[] args) {
        // 배열 생성
        int[] arr1 = new int[3];
        // 초기값 확인
        System.out.println("[int 배열 초기값 출력]");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr[" + i + "] = " + arr1[i]);
        }
        System.out.println();

        // 값 변경
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr[" + i + "] = " + arr1[i]);
        }
        System.out.println();


        double[] arr2 = new double[3];
        // 초기값 확인
        System.out.println("[double 배열 초기값 출력]");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr[" + i + "] = " + arr2[i]);
        }
        System.out.println();

        // 값 변경
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr[" + i + "] = " + arr2[i]);
        }
        System.out.println();

        // 배열 생성
        String[] arr3 = new String[3];
        System.out.println("[String 배열 초기값 출력]");
        // 초기값 확인
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr[" + i + "] = " + arr3[i]);
        }
        System.out.println();

        // 값 변경
        arr3[0] = "Jan";
        arr3[1] = "Feb";
        arr3[2] = "Mar";

        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr[" + i + "] = " + arr3[i]);
        }
    }
}
