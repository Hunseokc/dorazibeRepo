package ThisIsJava.ch18.sec02.ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec02/ex1/test2.db");

            byte[] arr = { 10, 20, 30, 40 };

            os.write(arr);
            os.flush();  // 버퍼 비우기
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
