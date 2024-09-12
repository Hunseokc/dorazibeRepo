package ThisIsJava.ch11.test.t8;

import java.io.IOException;

public class FIleWriterEx {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
            fw.writer("java");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {

            }
        }
    }
}
