package Forces.GrokkingAlgorithms.p04_Quicksort;

import java.util.Arrays;

/**
 * Максимальное число в массиве через рекурсию
 */
public class MaxCountArray {

    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 5, 10, 25, 16, 1})); // 25
        System.out.println(max(new int[]{1})); // 1
        System.out.println(max(new int[]{})); // 0
    }

    private static int max(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }
        int subMax = max(Arrays.copyOfRange(arr, 1, arr.length));
        return Math.max(arr[0], subMax);
    }
}
