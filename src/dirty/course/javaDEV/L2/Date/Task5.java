package dirty.course.javaDEV.L2.Date;

import java.time.LocalDate;

import java.time.Period;


import static java.time.temporal.ChronoUnit.DAYS;

/**
 *  Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Создать объект LocalDate, представляющий собой дату
 * 07.07.2018. Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */
public class Task5 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        LocalDate dateTime = LocalDate.of(2018,7,7);


        /*public enum ChronoUnit implements TemporalUnit */

      long daysBetween = DAYS.between(dateTime, timeNow);

        System.out.println(daysBetween);


        Period period = Period.between(dateTime,timeNow);

        System.out.println( period);

    }
}
