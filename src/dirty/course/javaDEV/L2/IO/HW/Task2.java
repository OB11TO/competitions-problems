package dirty.course.javaDEV.L2.IO.HW;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова,  для
 * которых последняя буква одного слова совпадает с первой буквой
 * следующего слова
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "javaDEV", "L2", "IO", "resources", "test.txt");

        try (Scanner scanner = new Scanner(path)) {
            String first = null;
            if (scanner.hasNext()) {
                first = scanner.next();
            }
            while (scanner.hasNext()) {
                String second = scanner.next();
                if (searchFirstLastLetter(first, second)) {
                    System.out.println(first + " " + second);
                }
                first = second;
            }
            
        }
    }

    private static boolean searchFirstLastLetter(String first, String second) {
        return first.charAt(first.length() - 1) == (second.charAt(0));
    }
}
