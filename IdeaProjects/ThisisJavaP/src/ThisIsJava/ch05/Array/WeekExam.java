package ThisIsJava.ch05.Array;

import java.util.Calendar;

public class WeekExam {
    public static void main(String[] args) {
        Week today = null;

        // 캘린더 객체 획득 후 Calendar 타입 cal 변수에 객체 대입
        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        if (today == Week.SUNDAY){
            System.out.println("일요일 => 축구의 날");
        } else {
            System.out.println("자바 공부의 날");
        }
    }
}
