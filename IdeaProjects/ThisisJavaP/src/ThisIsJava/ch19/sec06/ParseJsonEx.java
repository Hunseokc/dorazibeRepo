package ThisIsJava.ch19.sec06;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ParseJsonEx {
    public static void main(String[] args) throws IOException {
        // 파일에서 json 읽기
        BufferedReader br = new BufferedReader(
                new FileReader("/Users/seokhunchoi/Code/IdeaProjects/ThisisJavaP/src/ThisIsJava/ch19/sec06/member.json", Charset.defaultCharset()));
        String json = br.readLine();
        br.close();

        // 파싱 (객체화)
        JSONObject root = new JSONObject(json);

        // 속성 정보 읽기
        System.out.println("id : " + root.getString("id"));
        System.out.println("name : " + root.getString("name"));
        System.out.println("age : " + root.getInt("age"));
        System.out.println("student : " + root.getBoolean("student"));

        // 객체 속성 읽기
        JSONObject tel = root.getJSONObject("tel");
        System.out.println("home : " + tel.getString("home"));
        System.out.println("mobile : " + tel.getString("mobile"));

        // 배열 속성 읽기
        JSONArray skill = root.getJSONArray("skill");
        System.out.print("skill : ");
        for (int i = 0; i<skill.length();i++) System.out.print(skill.get(i) + ", ");
    }
}
