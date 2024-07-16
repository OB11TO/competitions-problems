package leetcode.easy.hashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RangArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40, 10, 20, 30})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{100, 100, 100})));
    }

    public static int[] arrayRankTransform2(int[] arr) {
        int rank = 1;
        int[] result = arr.clone();
        Arrays.sort(result);
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : result) {
            if (map.containsKey(j)) {
                continue;
            }
            map.put(j, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
                result[i] = map.get(arr[i]);
        }
        return result;
    }

    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = arr.clone();
        Arrays.sort(result);
        int rank = 1;
        for(int i : arr) {
            if(!map.containsKey(i)) {
                map.put(i, rank++);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}
