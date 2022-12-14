package course.javaDEV.lambda.functionTest;



import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 1) С помощью реализации Function<Integer[],Integer> и реализации Predicate<Integer>
 * реализуйте функцию, которая вернет количество простых
 * чисел в массиве целых чисел. Например, [5,6,7,8,9,10] => 2
 */

/*
 * Integer integer = 12311;
 * BigInteger bigInteger = BigInteger.valueOf(integer);
 * boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
 * System.out.println(probablePrime);
 */

public class ArrayInteger {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{5,6,7,8,9,10};
        Function<Integer[], Integer> function = new ArraySimpleInteger();

        System.out.println(function.apply(array));


    }
}

class ArraySimpleInteger implements Function<Integer[],Integer> {
    BigInteger bigInteger;
    Predicate<Integer> pr = integer1 -> bigInteger.isProbablePrime((int) Math.log(integer1));

    @Override
    public Integer apply(Integer[] integers) {
        Integer count = 0;
        for(Integer integer : integers){
            bigInteger = BigInteger.valueOf(integer);
            if(pr.test(integer)){
                count++;
            }


        }
        return count;
    }
}
