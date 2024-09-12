package ThisIsJava.ch11.test.t8;

import java.io.IOException;

public class FileWriterEx2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            try (fw){
                fw.writer("java");
            } catch (Exception e) {
                e.getMessage();
            }
        }catch (IOException e) {
            e.getMessage();
        }
    }
}
