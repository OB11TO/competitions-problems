package course.javaDEV.prac.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *  Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {
    public static void main(String[] args) {
        var now = LocalDate.now();
        var past = LocalDate.of(2018, 7, 7);

        var now1 = now.atStartOfDay();
        var past1 = past.atStartOfDay();
        var between = ChronoUnit.SECONDS.between(past1, now1);
        System.out.println(between);
    }
}
