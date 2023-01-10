package dirty.forces.grokkingAlgorithms.p04_Quicksort;

import java.util.Arrays;
/**
 * Сумма всех чисел в массиве через рекурсию
 */
public class RecursionSum {

    public static void main(String[] args) {
        System.out.println(sumRecursion(new int[]{1, 2, 3, 4})); // 10
    }

    private static int sumRecursion(int[] ints) {
        if(ints.length == 0) {
            return 0;
        } else {
            return ints[0] + sumRecursion(Arrays.copyOfRange(ints, 1, ints.length));
        }
    }
}
