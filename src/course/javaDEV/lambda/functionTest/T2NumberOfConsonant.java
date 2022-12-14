package course.javaDEV.lambda.functionTest;


import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Опишите такую реализацию Function<String, Integer> которая вернет количество гласных букв в
 * строке текста.
 */
public class T2NumberOfConsonant {
    public final static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Predicate<Character> ch = character -> {
            for(char c : vowels){
                if(character == c){
                    return true;
                }
            }
            return false;
        };

        Function<String, Integer> function = str -> {
            int result = 0;
            char[] ls = str.toCharArray();
            for (char l : ls) {
                if (ch.test(l)) {
                    result++;
                }
            }
            return result;
        };

        System.out.println(function.apply(sc.nextLine()));


    }

}
