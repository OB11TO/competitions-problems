package course.javaDEV.L2.IO;

import java.io.*;
import java.nio.file.Path;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        File fileOutputStream = Path.of("src","javaDEV", "L2", "IO", "resources", "output.txt").toFile();

        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileOutputStream,true))) {
            String text = "Hello";
            outputStream.write(text.getBytes());
            outputStream.write(System.lineSeparator().getBytes()); // \r \n
        }

    }
}
