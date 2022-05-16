package Course.javaDEV.L2.IO.HW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "javaDEV", "L2", "IO", "HW", "Task1.java");
        Path pathOutput = Path.of("src", "javaDEV", "L2", "IO", "resources", "output.txt");


        List<String> collect = Files.readAllLines(path).stream()
                .map(a -> a.replaceAll("public", "private"))
                .collect(Collectors.toList());

        Files.write(pathOutput, collect, StandardOpenOption.CREATE);
    }
}
