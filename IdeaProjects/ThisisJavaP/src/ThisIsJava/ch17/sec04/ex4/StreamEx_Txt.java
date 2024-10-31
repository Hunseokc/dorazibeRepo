package ThisIsJava.ch17.sec04.ex4;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx_Txt {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get(StreamEx_Txt.class.getResource("data.txt").toURI());
        // path에서 파일을 한 줄씩 읽는 스트림. 문자열 인코딩은 UTF-8 문자셋
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach( line -> System.out.println(line));
        stream.close();
    }
}
