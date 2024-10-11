package ThisIsJava.ch15.sec02.ex1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // 객체 개수 메소드
        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        // 인덱스로 객체 가져오기
        Board board = list.get(2);
        System.out.printf("%s\t%s\t%s\n", board.getSubject(), board.getContent(), board.getWriter());
        System.out.println();

        // 모든 객체 하나씩 가져오기
        for (int i = 0; i<list.size(); i++) {
            Board b = list.get(i);
            System.out.printf("%s\t%s\t%s\t", b.getSubject(), b.getContent(), b.getWriter());
            System.out.println();
    }
        System.out.println();

        list.remove(2);
        list.remove(2); // 원래 3번인게 삭제

        for (Board b : list) {
            System.out.printf("%s\t%s\t%s", b.getSubject(), b.getContent(), b.getWriter());
            System.out.println();
        }
    }
}
