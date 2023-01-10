package dirty.forces.grokkingAlgorithms.p01_BinarySearch;

/**
 * Бинарный поиск выполняется за логарифмическое время. Рекурсивно!
 */
public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] list = {1, 3, 5, 6, 70};

        System.out.println(binarySearchRecursive(list, 0, list.length - 1, 3)); // 1
        System.out.println(binarySearchRecursive(list, 0, list.length - 1, -1)); // null
        System.out.println(binarySearchRecursive(list, 0, list.length - 1, 70)); // 4

    }

    // Рекурсивная реализация алгоритма бинарного поиска для возврата
// позиция `target` в подмассиве nums[low…high]
    private static int binarySearchRecursive(int nums[], int low, int high, int target) {
        // Базовое условие (пространство поиска исчерпано)
        if (low > high) {
            return -1;
        }

        // находим среднее значение в пространстве поиска и
        // сравнивает его с целью

        int mid = (low + high) / 2;    // может произойти переполнение
        // int mid = low + (high - low)/2;

        // Базовое условие (найдено целевое значение)
        if (target == nums[mid]) {
            return mid;
        }

        // отбросить все элементы в правильном пространстве поиска,
        // включая средний элемент
        else if (target < nums[mid]) {
            return binarySearchRecursive(nums, low, mid - 1, target);
        }

        // отбрасываем все элементы в левой области поиска,
        // включая средний элемент
        else {
            return binarySearchRecursive(nums, mid + 1, high, target);
        }
    }
}
