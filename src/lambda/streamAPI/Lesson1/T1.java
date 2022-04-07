package lambda.streamAPI.Lesson1;


import lambda.streamAPI.Cat;

import java.util.Comparator;
import java.util.List;



/**
 * 1)Используя Stream API и List<Cat> верните самое длинное имя кота в этом списке.
 */

public class T1 {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("a", 14, "Red"),
                new Cat("barsiffk", 14, "Yellow"),
                new Cat("puma2", 14, "Black"),
                new Cat("puma1aaaaaaaaaaa", 14, "Yellow")
        );


      /*   Вывод по значению строки

      cats.stream()
                .map(Cat::getName)
                .max(String::compareTo).ifPresent(System.out::println);
*/

        //Вывод по длине строки
       cats.stream()
                .map(Cat::getName)
                .max(Comparator.comparingInt(String::length))
               .ifPresent(System.out::println);



    }
}
