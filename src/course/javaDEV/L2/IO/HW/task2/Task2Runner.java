package course.javaDEV.L2.IO.HW.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2Runner {
    public static void main(String[] args) throws IOException {
        Path pathOutput = Path.of("src", "javaDEV", "L2", "IO", "resources", "task2.txt");
        Files.write(pathOutput, RandomUtil.countRandom(100));
        Files.write(pathOutput, DigitHelper.readSorted(pathOutput));
    }
}
