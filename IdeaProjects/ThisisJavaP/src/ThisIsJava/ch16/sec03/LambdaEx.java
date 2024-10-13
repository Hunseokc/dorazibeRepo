package ThisIsJava.ch16.sec03;

public class LambdaEx {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1( (name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> System.out.printf("%s이 %s을 하지 않습니다.\n", name, job));

        person.action2( (word) -> {
            System.out.printf("\"%s\"라고 말합니다.\n", word);
        });
        person.action2( (word) -> System.out.printf("\"%s\"라고 외칩니다.\n", word));
    }
}
