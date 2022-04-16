package javaDEV.L2.Date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * Использовать LocalDateTime из предыдущего задания, преобразовать его
 * в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
 * прошедших миллисекунд.
 */
public class Task4 {
    public static void main(String[] args) {
        String date = "26-03-1968T09:24";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime time = LocalDateTime.parse(date,formatter);

        Instant newTime = time.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(time));
        Instant newTime2 = time.toInstant(ZoneOffset.UTC);
        System.out.println(time);
        System.out.println(newTime);
        System.out.println(newTime2);

        System.out.println(newTime.toEpochMilli());
    }
}
