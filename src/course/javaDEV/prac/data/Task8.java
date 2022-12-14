package course.javaDEV.prac.data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 *  Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 */
public class Task8 {
    public static void main(String[] args) {
        TemporalAdjuster temporalAdjuster = temporal -> temporal.plus(42L, ChronoUnit.DAYS);

        var now = LocalDate.now();
        var result = now.with(temporalAdjuster);

        System.out.println(now);
        System.out.println(result);
    }
}
