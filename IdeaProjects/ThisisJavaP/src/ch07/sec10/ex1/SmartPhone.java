package ch07.sec10.ex1;

public class SmartPhone extends Phone{
    SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("검색 실행");
    }
}
