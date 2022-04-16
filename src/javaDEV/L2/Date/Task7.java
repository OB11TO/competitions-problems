package javaDEV.L2.Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Создать объект Instant. Вывести его на консоль. Затем создать
 * объект ZonedDateTime на основании предыдущего объекта с тайм зоной "Africa/Cairo".
 */
public class Task7 {
    public static void main(String[] args) {
        Instant newInstant = Instant.now();
        System.out.println(newInstant);

        ZonedDateTime zonedDateTime = newInstant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
//     Либо
        ZonedDateTime zonedDateTime1 = ZonedDateTime.ofInstant(newInstant, ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime1);
    }
}
