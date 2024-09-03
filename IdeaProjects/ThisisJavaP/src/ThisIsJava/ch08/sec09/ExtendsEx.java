package ch08.sec09;

public class ExtendsEx {
    public static void main(String[] args) {
        InterfaceCImple cIm = new InterfaceCImple();

        InterfaceA ia = cIm;
        ia.methodA();
        // ia.methodB();
        System.out.println();

        InterfaceB ib = cIm;
        // ib.methodB();
        ib.methodB();
        System.out.println();

        // 상속받았으니 a,b의 메소드 호출 가능
        InterfaceC ic = cIm;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
