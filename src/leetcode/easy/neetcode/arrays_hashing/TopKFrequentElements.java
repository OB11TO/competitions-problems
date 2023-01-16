package leetcode.easy.neetcode.arrays_hashing;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums1 = {5, 5, 5, 2, 2, 2, 2, 3};
        int[] nums2 = {1};
        int[] nums3 = {};

        System.out.println(Arrays.toString(topKFrequent(nums1, 2)));
        System.out.println(Arrays.toString(topKFrequent(nums2, 1)));
        System.out.println(Arrays.toString(topKFrequent(nums3, 1)));
    }

    //
//    * Time Complexity: O(nlog(k))
//    * Space Complexity: O(n)
//
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        if (nums.length == 1 && k == 1) {
            return nums;
        }
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) pq.poll();
        }
        System.out.println(map);
        System.out.println(pq);
        int i = k;
        while (!pq.isEmpty()) {
            result[--i] = pq.poll().getKey();
        }
        return result;
    }

    public static int[] topKFrequent2(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        if (nums.length == 1 && k == 1) {
            return nums;
        }

        Map<Integer, Integer> map = new TreeMap<>();
        for (int key : nums) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }

        }
        var collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).collect(Collectors.toList());

        Collections.reverse(collect);

//        System.out.println(map);
//        System.out.println(collect);
        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {
            result[i] = collect.get(i);
        }


        return result;
    }
}
