package ch05.StringType;

public class SplitExam {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String 학습";

        String[] tokens = board.split(",");

        // 인덱스별 읽기
        System.out.println("번호 : "+ tokens[0]);
        System.out.println("제목 : "+ tokens[1]);
        System.out.println("내용 : "+ tokens[2]);
        System.out.println();
        System.out.println();

        // for 문으로 한 줄씩 반복문 읽기
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

    }
}
