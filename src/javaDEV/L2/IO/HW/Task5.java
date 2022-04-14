package javaDEV.L2.IO.HW;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Задан файл с java-кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "javaDEV", "L2", "IO", "HW", "Task1.java");
        Path pathOutput = Path.of("src", "javaDEV", "L2", "IO", "resources", "test2.txt");


        try (Stream<String> stringStream = Files.lines(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(pathOutput)) {
            stringStream.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(lines -> {
                        try {
                            bufferedWriter.write(lines.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }

       // Files.write(pathOutput, strings);

    }
}
