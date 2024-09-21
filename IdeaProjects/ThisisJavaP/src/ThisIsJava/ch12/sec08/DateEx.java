package ThisIsJava.ch12.sec08;

import java.util.*;
import java.text.*;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println(sdf.format(now));
    }
}
