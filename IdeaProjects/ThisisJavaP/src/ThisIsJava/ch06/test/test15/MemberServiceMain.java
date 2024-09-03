package ThisIsJava.ch06.test.test15;

public class MemberServiceMain {
    public static void main(String[] args) {
        MemberService memberS = new MemberService();
        boolean result = memberS.login("hong", "12345");
        if (result) {
            System.out.println("로그인 성공");
            memberS.logout("hong");
        } else {
            System.out.println("id or pw incorrect");
        }
    }
}
