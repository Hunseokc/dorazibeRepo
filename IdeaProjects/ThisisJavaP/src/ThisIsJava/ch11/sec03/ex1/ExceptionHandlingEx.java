package ThisIsJava.ch11.sec03.ex1;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        String[] array = {"100" , "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.printf("array[%d] : %d\n", i, value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과 : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환 불가능 : " + e.getMessage());
            }
        }
    }
}
