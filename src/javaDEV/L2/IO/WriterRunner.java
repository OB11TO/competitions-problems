package javaDEV.L2.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        File fileOutputStream = Path.of("src","javaDEV", "L2", "IO", "resources", "output2.txt").toFile();

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOutputStream,true))) {
            fileWriter.append("Что вершит судьбу человечества в этом мире?");
            fileWriter.newLine();
            fileWriter.append("GUTS");

        }
    }
}
