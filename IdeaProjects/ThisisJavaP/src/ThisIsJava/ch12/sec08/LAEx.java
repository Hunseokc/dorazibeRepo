package ThisIsJava.ch12.sec08;

import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

public class LAEx {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch (week) {
            case Calendar.MONDAY -> strWeek = "월";
            case Calendar.TUESDAY -> strWeek = "화";
            case Calendar.WEDNESDAY -> strWeek = "수";
            case Calendar.THURSDAY -> strWeek = "목";
            case Calendar.FRIDAY -> strWeek = "금";
            case Calendar.SATURDAY -> strWeek = "토";
            default -> strWeek = "일";
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM) {
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.print(year + "년 ");
        System.out.print(month + "월 ");
        System.out.print(day + "일 ");
        System.out.print(strWeek + "요일 ");
        System.out.print(strAmPm + " ");
        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.print(second + "초 ");
    }
}
