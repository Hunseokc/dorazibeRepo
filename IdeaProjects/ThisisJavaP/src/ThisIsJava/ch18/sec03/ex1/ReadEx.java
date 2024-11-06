package ThisIsJava.ch18.sec03.ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec02/ex1/test2.db");

            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
