package course.javaDEV.lambda.unaryOperationTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Создайте реализацию UnaryOperator<String> где результатом будет строка в которой
 * исключены все символы кроме цифровых. Т.е. если входящим параметром является
 * строка вида «Hello 123 world» результатом будет строка «123».
 */
public class T2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("       Hello         1 23     world !"));

        UnaryOperator<String> operation = str -> str.replaceAll("[^\\d. ]","").trim();

        //String result = self.replaceAll("\\w|\\d", "")//регулярным выражением заменяем буквы(\\w) и цифры(\\d) на пустую строку, то есть удаляем.
        String str = String.valueOf(list);
        String result = operation.apply(str);
        System.out.println(result);
    }
}
