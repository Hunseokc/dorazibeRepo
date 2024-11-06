package ThisIsJava.ch18.sec04.ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec04/ex1/test.txt");
            // 1 문자씩 출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = { 'C', 'D', 'E' };
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
