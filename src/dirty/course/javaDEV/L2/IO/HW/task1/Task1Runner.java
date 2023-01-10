package dirty.course.javaDEV.L2.IO.HW.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Task1Runner {
    public static void main(String[] args) throws IOException {
        Path pathInput = Path.of("src", "javaDEV", "L2", "IO", "resources", "test.txt");
        Path pathOutput = Path.of("src", "javaDEV", "L2", "IO", "resources", "test3.txt");

        Map<Character, Integer> characterFrequency = CharacterHelper.calcFrequency(pathInput);

        Files.write(pathOutput,CharacterHelper.toListRepresentation(characterFrequency));

    }
}
