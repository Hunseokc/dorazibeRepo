package ch06.sec07.ex05;

public class Car {
    // 필드 선언
    String company = "HYUNDAI";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    Car(String model){
        this(model, "은색", 250);
    }

    Car(String model, String color){
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
