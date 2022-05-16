package Course.javaDEV.lambda.predicateTest;


import java.util.function.Predicate;

/**
 * Создайте такую реализацию IntPredicate которая будет возвращать true в случае когда сумма
 * цифр числа число четное. Например, для 1) вернет true в 103 — вернет true, так 1) вернет true в 1+0+3 = 4.
 */


//Суммирование цифр числа
       /* sum += (n % 10);
                n/=10;*/

public class MyPredicate {

    public static void main(String[] args) {

        int[] array = new int[ ]{41,224 ,104, 23, 11};

        for (int j : array) {
            final int n = sumNumber(j);
            Predicate<Integer> pr = new IntPredicate<>();
            System.out.println(pr.test(n));
        }

    }

    private static int sumNumber(int i) {
        int sum = 0;
        while(i !=0){
            sum += (i%10);
            i/=10;
        }
        return sum;
    }

}

class IntPredicate<T> implements Predicate<T> {

    @Override
    public boolean test(T t) {
            int n = (Integer) t;
            return n%2 == 0;
        }
    }