package ThisIsJava.ch18.sec07.ex2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineEx {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec07/ex2/ReadLineEx.java")
        );

        int lineNo = 1;
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println(lineNo+"\t" + str);
            lineNo++;
        }
        br.close();
    }
}
