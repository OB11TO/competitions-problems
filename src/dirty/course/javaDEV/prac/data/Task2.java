package dirty.course.javaDEV.prac.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
 * консоль.
 */
public class Task2 {
    public static void main(String[] args) {
        var now = LocalDate.now();

        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        var format = now.format(dateTimeFormatter);
        System.out.println(format);
    }
}
