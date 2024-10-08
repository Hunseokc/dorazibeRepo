package ThisIsJava.ch13.test.t4;

public class UtilEx {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childage = Util.getValue(childPair, "홍삼순");
        System.out.println(childage);

        OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
        //Integer otherage = Util.getValue(otherPair, "홍삼원");
        System.out.println(otherPair.getKey());
        // OtherPair는 Pair를 상속하지 않아서 getValue(Pair pair)
        // 매개변수로 존재하지 않는 클래스를 받게 됌
    }
}
