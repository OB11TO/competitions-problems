package Course.javaDEV.L2.IO.HW;

import java.io.IOException;

import java.nio.file.Path;
import java.util.Scanner;


/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class Task1 {

    public static final String VOWEL = "аеоуэяию";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "javaDEV", "L2", "IO", "resources", "test.txt");

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String next = scanner.next();
                char firstWord = next.charAt(0);
                if (VOWEL.indexOf(firstWord) != -1) {
                    System.out.println(next);
                }

            }
        }
    }
}