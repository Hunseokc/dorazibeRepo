package ch06.sec08.ex2;

public class Computer {
    int sum(int ... values){
        int result = 0;
        for (int i = 0; i<values.length;i++){
            result += values[i];
        }
        return result;
    }
}
