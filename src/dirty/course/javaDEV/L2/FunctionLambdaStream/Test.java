package dirty.course.javaDEV.L2.FunctionLambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 332, 4, 532, 6, 7));

        integers.stream()
                .map(integer -> integer + integer)
                .map(String::valueOf)
                .filter(value -> value.length() > 2)
                .forEach(System.out::println);


        System.out.println(integers);

    }

}
