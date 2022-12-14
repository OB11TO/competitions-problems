package forces.grokkingAlgorithms.p04_Quicksort;

/**
 * Сумма всех чисел в массиве через цикл
 */
public class LoopSum {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4})); // 10
    }

    private static int sum(int[] ints) {
        int total = 0;
        for (int anInt : ints) {
            total += anInt;
        }
        return total;
    }
}

