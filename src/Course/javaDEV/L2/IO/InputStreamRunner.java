package Course.javaDEV.L2.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("src", "javaDEV", "L2", "IO", "resources", "test3.txt").toFile();


       /*
        Этот метод предназначен для простых случаев, когда удобно считать все байты в массив байтов.
        Он не предназначен для чтения входных потоков с большими объемами данных

        try (FileInputStream in = new FileInputStream(file)) {
            byte[] allBytes = in.readAllBytes();
            String text = new String(allBytes);
            System.out.println(text);


        Но если текст большой, занимает большое количество байт
        Пример: Видео, который занимает гигабайт. Придется выделять память, что не оч круто.
        Лучше сделать считывание по порции, сразу перенаправление пользователю через браузер.

        Для этого лучше использовать метод из InputStream read(), который считает по 1 байту
        */

        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int count = 0;
            byte currentBytes;
            while((currentBytes = (byte) inputStream.read()) != -1){
                bytes[count++] = currentBytes;
            }
            String text = new String(bytes);
            System.out.println(text);
        }

    }
}
