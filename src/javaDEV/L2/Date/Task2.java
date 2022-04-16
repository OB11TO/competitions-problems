package javaDEV.L2.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *  Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
 * консоль.
 */
public class Task2 {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = myDate.format(formatter);
        System.out.println(format);
    }
}
