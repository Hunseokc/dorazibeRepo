package ch05.test;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentNum = 0;
        int[] score = null;
        POP : while (true){
            System.out.println("---------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택>");
            String choice = scan.nextLine();
            int choiceNum = Integer.parseInt(choice);

            switch (choiceNum){
                case 1:
                    System.out.print("입력>");
                    String student = scan.nextLine();
                    studentNum = Integer.parseInt(student);
                    break;
                case 2:
                    if (studentNum < 1){
                        System.out.println("학생 수를 먼저 입력해주세요");
                        break;
                    }
                    score = new int[studentNum];
                    for (int i = 0; i < studentNum; i++){
                        System.out.printf("scores[%d]>", i);
                        String scoreScan = scan.nextLine();
                        int scoreInt = Integer.parseInt(scoreScan);
                        score[i] = scoreInt;
                    }
                    break;
                case 3:
                    if (studentNum < 1){
                        System.out.println("학생 수를 먼저 입력해주세요");
                        break;
                    }
                    for (int i = 0; i < studentNum; i++){
                        System.out.printf("score[%d] : %d", i, score[i]);
                        System.out.println();
                    }
                    break;
                case 4:
                    if (score == null)
                        break;
                    int result = 0;
                    double avg = 0;
                    for (int i = 0; i < studentNum; i++){
                        result += score[i];
                    }
                    avg = (double) result / studentNum;

                    System.out.println("최고 점수 : " + result);
                    System.out.println("평균 점수 : " + avg);
                    break;
                case 5:
                    break POP;
            }
        }
    }
}
