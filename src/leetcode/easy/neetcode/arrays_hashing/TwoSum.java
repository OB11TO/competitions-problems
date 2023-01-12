package leetcode.easy.neetcode.arrays_hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] i = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(i, target)));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map =  new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[] {i, map.get(comp)};
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map =  new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[] {i, map.get(comp)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
