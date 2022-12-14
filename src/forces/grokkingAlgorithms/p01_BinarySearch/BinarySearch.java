package forces.grokkingAlgorithms.p01_BinarySearch;

/**
 *  Бинарный поиск выполняется за логарифмическое время.
 */

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = {1, 3, 5, 6, 70};

        System.out.println(binarySearch(list, 3)); // 1
        System.out.println(binarySearch(list, -1)); // null
        System.out.println(binarySearch(list, 70)); // 70

    }

    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mind = (low + high) / 2;
            int guess = list[mind];
            if (guess == item) {
                return guess;
            }
            if (guess > item) {
                high = mind - 1;
            } else {
                low = mind + 1;
            }
        }
        return null;
    }
}
