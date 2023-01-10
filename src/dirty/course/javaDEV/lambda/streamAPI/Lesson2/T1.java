package dirty.course.javaDEV.lambda.streamAPI.Lesson2;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Удалите из строки текста все слова длиннее 5 символов.
 */
public class T1 {
    public static void main(String[] args) {
        String text = "aaaaaa aa aaa aaaaaa aa";

        Stream<String> stream = Arrays.stream(text.split(" "));
        stream
                .filter(word -> word.length() < 5)
                .forEach(System.out::println);
    }
}
