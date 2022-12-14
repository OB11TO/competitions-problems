package course.javaDEV.lambda.streamAPI.Lesson1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2)Используя Stream API и List<Integer> выделите только нечетные числа, отсортируйте их
 * по возрастанию и соберите в новый список.
 */

public class T2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(-1,4,-3,2,6,11,8,7,9);

        List<Integer> collect = list.stream()
                .filter(integer -> integer % 2 != 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
