package Course.javaDEV.prac.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
 * собой дату, полученную из этой строки.
 */
public class Task3 {
    public static void main(String[] args) {
        String dateTime = "26-03-1968T09:24";
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        var parse = LocalDateTime.parse(dateTime, dateTimeFormatter);
        System.out.println(parse);
    }
}
