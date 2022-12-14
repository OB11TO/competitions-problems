package course.javaDEV.L2.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
 * собой дату, полученную из этой строки.
 */
public class Task3 {
    public static void main(String[] args) {
        String date = "26-03-1968T09:24";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm"); //mRAZZZZZ
        LocalDateTime time = LocalDateTime.parse(date,formatter);
//     String formatDateTime = time.format(formatter);

        System.out.println(time);
    }
}
