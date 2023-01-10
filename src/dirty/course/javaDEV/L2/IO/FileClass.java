package dirty.course.javaDEV.L2.IO;

import java.io.File;
import java.io.IOException;

import java.nio.file.Path;


public class FileClass {
    public static void main(String[] args) throws IOException {

        File file = new File("src/Course.javaDEV/L2/IO/resources/test.txt");
        File file2 = new File("src/Course.javaDEV/L2/IO/resources/test2.txt");
        System.out.println(file2.createNewFile());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getName());
        System.out.println(file.getPath());

        System.out.println(file.compareTo(file2));

       File file3 = Path.of("src","javaDEV","L2", "IO", "resources", "test3.txt").toFile(); // создаст новый файл
        System.out.println(file3.createNewFile());

    }
}
