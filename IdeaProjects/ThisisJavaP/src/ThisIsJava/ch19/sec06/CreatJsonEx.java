package ThisIsJava.ch19.sec06;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreatJsonEx {
    public static void main(String[] args) throws IOException {
        JSONObject root = new JSONObject();

        // tuple 형태로 속성 추가 (Map과 동일)
        root.put("id", "winter");
        root.put("name", "한겨울");
        root.put("age", 25);
        root.put("student", true);

        // 객체를 속성에 추가
        JSONObject tel = new JSONObject();
        tel.put("home", "02-123-1234");
        tel.put("mobile", "010-123-1234");
        root.put("tel", tel);

        JSONArray skill = new JSONArray();
        skill.put("java");
        skill.put("c");
        skill.put("c++");
        root.put("skill", skill);

        // JSON 획득
        System.out.println(root);
        String json = root.toString();  // toString도 가능
        System.out.println(json);

        Writer writer = new FileWriter("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch19/sec06/member.json", Charset.defaultCharset());
        writer.write(json);
        writer.flush();
        writer.close();

    }
}
