package stepikLambda;


/*
 * Замена цифр числа
 * В этой задаче вам нужно написать собственное правило и передать его substitution методу для замены цифр числа. Определение точно такое же, как показано на предыдущем шаге.
 *
 * public static int substitution(long n, Function<Integer, Integer> digitRule)
 * Правило должно действовать следующим образом:
 *
 * Если цифра есть 5, то она должна заменить ее на1;
 * если цифра есть 6, то она должна заменить ее на2;
 * если цифра есть 7, то она должна заменить ее на3;
 * если цифра есть 8, то она должна заменить ее на4;
 * если цифра есть 9, то она должна заменить ее на5;
 * любые другие цифры не должны быть заменены.
 * Существует целый ряд способов выработать это правило. Чем короче ваше решение, тем лучше! :)
 *
 * Обратите внимание, что substitution метод принадлежит Utils классу.
 *
 * Пример ввода:
 *
 * 12765
 * Пример вывода:
 *
 * 12321
 */

import java.util.Scanner;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();

        int result = Utils.substitution(n, integer -> switch (integer) {
            case 5 -> 1;
            case 6 -> 2;
            case 7 -> 3;
            case 8 -> 4;
            case 9 -> 5;
            default -> integer;
        });


        System.out.println(result);
    }
}

class Utils {

    public static int substitution(long n, Function<Integer, Integer> digitRule) {
        String numberAsString = String.valueOf(n);
        int result = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            result *= 10;
            int nextDigit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            result += digitRule.apply(nextDigit);
        }

        return result;
    }
}
