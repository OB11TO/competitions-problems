package Course.javaDEV.L2.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 */

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020,6,25,19,47);
        LocalDateTime resultDateTime = dateTime.plusMonths(3L);

        LocalDate date = resultDateTime.toLocalDate();
        LocalTime time = resultDateTime.toLocalTime();

        System.out.println(date + " " + time);
    }
}
