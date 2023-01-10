package dirty.forces.grokkingAlgorithms.p04_Quicksort;

import java.util.Arrays;

/**
 * Количество всех чисел в массиве через рекурсию
 */
public class RecursionCountArray {

    public static void main(String[] args) {
        System.out.println(countRecursion(new int[]{1, 2, 3, 4})); // 10
    }

    private static int countRecursion(int[] ints) {
        if (ints.length == 0) {
            return 0;
        } else {
            return 1 + countRecursion(Arrays.copyOfRange(ints, 1, ints.length));
        }
    }
}
