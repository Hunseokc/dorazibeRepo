package ThisIsJava.ch18.test.t7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Ex_lineNum {
    public static void main(String[] args) throws Exception {
        String filePath = "/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch02/PromotionExample.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if(rowData == null) break;
            rowNumber++;
            System.out.println(rowNumber + ": "+ rowData);
        }
        br.close();
        fr.close();
    }
}
