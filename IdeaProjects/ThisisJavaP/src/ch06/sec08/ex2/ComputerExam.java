package ch06.sec08.ex2;

public class ComputerExam {
    public static void main(String[] args){
        Computer myCom = new Computer();

        int result1 = myCom.sum(1,2,3);
        System.out.println("결과1>"+result1);

        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("결과2>"+result2);

        int[] values = {1,2,3,4,5};
        int result3 = myCom.sum(values);
        System.out.println("결과3>"+result3);

        int result4 = myCom.sum(new int[] {1,2,3,4,5});
        System.out.println("결과4>"+result4);
    }
}