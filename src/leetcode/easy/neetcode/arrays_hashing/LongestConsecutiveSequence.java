package leetcode.easy.neetcode.arrays_hashing;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        System.out.println(longestConsecutive(new int[]{1444, 4, 123, 55555}));
    }

    public static  int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            String str = String.valueOf(nums[0]);
            return str.length();
        }

        String max = "";
        for(int i : nums) {
            String value = String.valueOf(i);
            if(max.length() < value.length()) {
                max = value;
            }
        }
        return max.length();
    }
}
