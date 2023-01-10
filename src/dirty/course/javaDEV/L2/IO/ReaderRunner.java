package dirty.course.javaDEV.L2.IO;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "javaDEV", "L2", "IO", "resources", "test3.txt").toFile();

        //Старый способ, но он есть. Лучше уже так не делать.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String result = bufferedReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(result);
        }
    }
}
