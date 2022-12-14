package course.javaDEV.lambda.differentTask;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstInitialsOfTheName {
    public static void main(String[] args) {
        String name = format("Ivan", "Ivanov", "Iovanovitch");
        System.out.println(name);

    }

    public static String format(String firstname, String lastname, String oName){
        String[] array = {firstname, lastname, oName};
        return Arrays.stream(array)
                .map(s -> Character.toUpperCase(s.charAt(0)))
                .map(Object::toString)
                .collect(Collectors.joining("."));
    }
}
