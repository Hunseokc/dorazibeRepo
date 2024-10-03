package ThisIsJava.ch13.sec02.ex1;

public class Product <K, M> {
    // 제네릭 타입 필드 선언
    private K kind;
    private M model;

    // 리턴값이 제네릭 타입인 메소드
    public K getKind() { return this.kind; }
    public M getModel() { return this.model; }
    public void setKind(K kind) { this.kind = kind; }
    public void setModel(M model) { this.model = model; }
}
