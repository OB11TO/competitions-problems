package javaDEV.L2.IO.HW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *  Задан файл с текстом. В каждой строке найти и вывести
 * наибольшее число цифр, идущих подряд.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "javaDEV", "L2", "IO", "resources", "test.txt");

        Files.readAllLines(path).stream()
                .map(Task3::findMaxCount)
                .forEach(System.out::println);
    }

    private static Integer findMaxCount(String line) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if(Character.isDigit(line.charAt(i))){
                count++;
            }
            else{
                if(result < count){
                    result = count;
                }
                count = 0;
            }
        }


        return result;
    }
}
