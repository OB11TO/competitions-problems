package course.javaDEV.L2.Date;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        LocalDate dateTime = LocalDate.of(2018,7,7);
       // LocalDateTime.of(timeNow, LocalTime.MIDNIGHT);

        LocalDateTime localDateTime = timeNow.atStartOfDay();
        LocalDateTime localDateTime1 = dateTime.atStartOfDay();

    //    LocalTime localTime = localDateTime.toLocalTime();
        Duration duration = Duration.between(localDateTime1, localDateTime);
        long between = ChronoUnit.SECONDS.between(localDateTime1, localDateTime);
        System.out.println(between);
        System.out.println(duration.getSeconds());


    }
}
