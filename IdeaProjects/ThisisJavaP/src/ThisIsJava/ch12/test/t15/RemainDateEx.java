package ThisIsJava.ch12.test.t15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RemainDateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.of(2024,12,31,0,0,0);

        Long remainDay = now.until(end, ChronoUnit.DAYS);
        System.out.println(remainDay);
    }
}
