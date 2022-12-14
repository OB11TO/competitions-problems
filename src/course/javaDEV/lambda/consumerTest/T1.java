package course.javaDEV.lambda.consumerTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 1)Реализуйте Consumer<Integer> с помощью которого выведите на экран все нечетные
 * числа содержащиеся в List<Integer>.
 */
public class T1 implements A, B {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        Consumer<Integer> result = a -> {
            if(a % 2 != 0){
                System.out.println(a);
            }
        };

        list.forEach(result);
    }

    @Override
    public int sum() {
        return 0;
    }

}


interface A{
    int sum();
}

interface B{
    int sum();
}






