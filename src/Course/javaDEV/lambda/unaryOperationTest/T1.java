package Course.javaDEV.lambda.unaryOperationTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * С помощью реализации UnaryOperator замените все нечетные числа в списке целых
 * чисел на нули.
 */

public class T1 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 8, 9));

        UnaryOperator<Integer> operation = a -> {
            if (a % 2 != 0) {
                a = 0;
            }
            return a;
        };

        listNumber.replaceAll(operation);
        System.out.println(listNumber);
    }
}
