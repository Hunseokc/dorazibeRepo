package ThisIsJava.ch11.sec03.ex3;

    public class ExceptionHandlingEx {
        public static void main(String[] args) {
            String[] array = {"100" , "1oo", null, "200"};

            for (int i = 0; i <= array.length; i++) {
                try {
                    int value = Integer.parseInt(array[i]);
                    System.out.printf("array[%d] : %d\n", i, value);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("배열 인덱스 초과 : " + e.getMessage());
                } catch (NullPointerException | NumberFormatException e) {
                    System.out.println("입력된 데이터가 실행 불가능한 값" + e.getMessage());
                }
            }
        }
    }
