package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2}));
    }

    public static int majorityElement(int[] nums) {
        Integer target = nums.length / 2; //3
        Integer count = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, count);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > target) {
                return entry.getKey();
            }
        }
        return map.get(nums[0]);
    }
    public int majorityElement3(int[] nums) {
        int majority = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            if(map.get(nums[i]) > majority)) {
                result = nums[i];
                majority = map.get(nums[i]);
            }
        }

        return result;
    }

    public int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;
    }
}

