package ThisIsJava.ch18.sec03.ex3;

import java.io.*;

public class ReadEx {
    public static void main(String[] args) throws Exception{
        String originalFileName = "/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec03/ex3/test.jpg";
        String targetFileName = "/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec03/ex3/test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] arr = new byte[1024];
        while (true) {
            int num = is.read(arr);
            if (num == -1) break;
            os.write(arr, 0, num);
        }
        os.flush();
        os.close();
        is.close();

        System.out.println("복사 완료");
    }
}
