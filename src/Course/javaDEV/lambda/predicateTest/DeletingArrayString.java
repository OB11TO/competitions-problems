package Course.javaDEV.lambda.predicateTest;


import java.util.ArrayList;
import java.util.List;


/**
 * Используя реализацию Predicate<String> реализуйте удаление со списка строк, строки первая
 * буква которых задается отдельным массивом символов. Например, если этот массив содержит
 * ['h','a','t'] то со списка стоит удалить все строки которые начинаются с этих букв.
 */
public class DeletingArrayString {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>(List.of("Rama", "Fma", "Kira", "Guts", "Fuck"));
        char[] str = {'f', 'g'};

        for(int i = 0; i < str.length; i++){
            final int finalI = i;
            name.removeIf(s -> s.toLowerCase().startsWith(String.valueOf(str[finalI])));
        }

        System.out.println(name);
    }



}
