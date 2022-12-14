package forces.grokkingAlgorithms.p02_SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Сортировка выбором
 */

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }

    private static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());


        var size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallestIndex = findSmallest(arr);
            newArr.add(arr.get(smallestIndex));

            arr.remove(smallestIndex);
        }

        return newArr;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
