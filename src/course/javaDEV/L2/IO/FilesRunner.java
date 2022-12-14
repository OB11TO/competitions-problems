package course.javaDEV.L2.IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilesRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "javaDEV", "L2", "IO", "resources", "test3.txt");


        //Reader
        try (Stream<String> stringStream = Files.lines(path)) {
            stringStream.forEach(System.out::println);
        }

        //Writer
        try(BufferedWriter reader = Files.newBufferedWriter(path)){
            reader.append("BERSERK");
        }

        //или

        Files.write(path, List.of("Hello Guts"));
    }
}
