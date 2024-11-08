package ThisIsJava.ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileEx {
    public static void main(String[] args) throws Exception {
        File dir = new File("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec11/images");
        File file1 = new File("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec11/file1.txt");
        File file2 = new File("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec11/file2.txt");
        File file3 = new File("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec11/file3.txt");

        // 존재하지 않으면 생성
        if (!dir.exists()) { dir.mkdirs(); }
        if (!file1.exists()) { file1.createNewFile(); }
        if (!file2.exists()) { file2.createNewFile(); }
        if (!file3.exists()) { file3.createNewFile(); }

        // Temp 폴더 내용 출력
        File temp = new File("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch18/sec11");
        File[] contents = temp.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(file.lastModified()));
            if(file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
