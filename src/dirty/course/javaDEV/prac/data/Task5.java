package dirty.course.javaDEV.prac.data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Создать объект LocalDate, представляющий собой дату
 * 07.07.2018. Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */
public class Task5 {
    public static void main(String[] args) {
        var now = LocalDate.now();
        var past = LocalDate.of(2018, 7, 7);

        var between = ChronoUnit.DAYS.between(past, now);
        System.out.println(between);
    }
}
