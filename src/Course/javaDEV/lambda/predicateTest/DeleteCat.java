package Course.javaDEV.lambda.predicateTest;




import Course.javaDEV.lambda.predicateTest.Cat.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Используя реализацию Predicate<Cat> (в качестве Cat взять класс используемый в лекции) и
 * методы для логических функций, реализуйте удаление из списка Cat котов возраст которых
 * меньше определенного значения (задается как параметр), а имя по алфавиту идет после буквы
 * (задается так же как параметр). Например, если первый параметр задан как 5, а второй как 'C' то
 * будет удален Cat [name=Tika, age=4], Cat [name=Kuzma, age=2) вернет true в случае если имя кошки ].
 */
public class DeleteCat  {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2,cat3, cat4,cat5));

        Predicate<Cat> pr1 = a -> a.getAge() < 5;
        Predicate<Cat> pr2 = a -> compareStrings(a.getName(), "C");


        cats.removeIf(pr1.and(pr2));

        System.out.println(cats);


    }
    public static boolean compareStrings(String s1, String s2) {

        int comparedResult = s1.compareTo(s2);

        return comparedResult >= 0;
    }

}
