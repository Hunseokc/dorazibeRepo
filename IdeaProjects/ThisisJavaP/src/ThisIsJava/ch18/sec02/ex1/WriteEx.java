package ThisIsJava.ch18.sec02.ex1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec02/ex1/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();  // 버퍼 비우기
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
