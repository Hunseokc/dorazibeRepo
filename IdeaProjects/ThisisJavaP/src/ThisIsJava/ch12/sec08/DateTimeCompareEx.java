package ThisIsJava.ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEx {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        System.out.println("시작일 : " + startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
        System.out.println("종료일 : " + endDateTime.format(dtf));

        if (startDateTime.isBefore(endDateTime)) {
            System.out.println("진행 중");
        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료 시행");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("종료된 내용");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinutes = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSeconds = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("남은 해 : " + remainYear);
        System.out.println("남은 월 : " + remainMonth);
        System.out.println("남은 일 : " + remainDay);
        System.out.println("남은 시간 : " + remainHour);
        System.out.println("남은 분 : " + remainMinutes);
        System.out.println("남은 초 : " + remainSeconds);
    }
}
