package Course.javaDEV.prac.data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * Использовать LocalDateTime из предыдущего задания, преобразовать его
 * в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
 * прошедших миллисекунд.
 */
public class Task4 {
    public static void main(String[] args) {
        String dateTime = "26-03-1968T09:24";
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        var parse = LocalDateTime.parse(dateTime, dateTimeFormatter);

        var instant = Instant.from(parse.atZone(ZoneId.of("America/Chicago")));

        System.out.println(instant);
    }
}
