package Course.javaDEV.L2.Date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *  Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 */
public class Task8 {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();

        LocalDateTime localDateTime = nowTime.with(temporal -> temporal.plus(1L, ChronoUnit.DAYS));

        System.out.println(localDateTime);
    }
}
