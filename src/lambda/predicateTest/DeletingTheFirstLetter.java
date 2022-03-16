package lambda.predicateTest;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * С помощью реализации Predicate<String> реализуйте удаление со списка строк начинающихся с
 * определенной буквы. Например, удалить все строки которые начинаются на букву F.
 */
public class DeletingTheFirstLetter {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>(List.of("Rama", "Fma", "Kira", "Guts", "Fuck"));

        Predicate<String> deleteF = a -> a.startsWith("F");

        name.removeIf(deleteF);

        System.out.println(name);
    }

}
