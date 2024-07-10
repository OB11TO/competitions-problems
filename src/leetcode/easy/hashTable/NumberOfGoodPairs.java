package leetcode.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        numIdenticalPairs(new int[]{1,1,1,1});
    }

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            int n = e.getValue();
            count = count + ((n*(n-1))/2);
        }
        return count;
    }
}
