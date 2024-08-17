package ch06.sec10.ex2;

public class Televi {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
