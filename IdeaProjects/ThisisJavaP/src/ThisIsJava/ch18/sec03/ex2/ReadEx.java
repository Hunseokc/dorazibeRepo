package ThisIsJava.ch18.sec03.ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec02/ex1/test2.db");
            byte[] arr = new byte[100];

            while (true) {
                int num = is.read(arr);
                if (num == -1) break;
                for (int i = 0; i<num;i++) System.out.println(arr[i]);
                System.out.println(num);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
