package ch08.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("dM1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("dM2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("dM 중복 1");
        System.out.println("dM 중복 2");
    }

    static void staticMethod1() {
        System.out.println("sM1 종속 코드");
        staticComoon();
    }

    static void staticMethod2() {
        System.out.println("sM2 종속 코드");
        staticComoon();
    }

    private static void staticComoon() {
        System.out.println("sM 중복 1");
        System.out.println("sM 중복 2");
    }
}
