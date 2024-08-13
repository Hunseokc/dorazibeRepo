package ch05.Array;

public class ArrayCopyByForExam {
    public static void main(String[] args) {
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
            System.out.println(newIntArray[i]);
        }
    }
}
