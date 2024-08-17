package ch06.sec07.ex05;

import ch06.sec07.ex05.Car;

public class CarExam {
    public static void main(String[] args){

        Car Car2 = new Car("그랜저");
        System.out.println("제조사 : " + Car2.company);
        System.out.println("모델명 : " + Car2.model);
        System.out.println();

        Car Car3 = new Car("소나타", "검정");
        System.out.println("제조사 : " + Car3.company);
        System.out.println("모델명 : " + Car3.model);
        System.out.println("색깔 : " + Car3.color);
        System.out.println();

        Car Car4 = new Car("스타렉스", "빨강", 300);
        System.out.println("제조사 : " + Car4.company);
        System.out.println("모델명 : " + Car4.model);
        System.out.println("색깔 : " + Car4.color);
        System.out.println("최고 속도 : " + Car4.maxSpeed);
        System.out.println();
    }
}
