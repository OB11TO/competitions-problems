package leetcode.easy.other;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {3, 3,8,10};
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int guess = nums[mid];
            if(guess == target) {
                return mid;
            }
            if(guess > target) {
                high = mid - 1;
            } else {
                low = mid  + 1;
            }
        }
        return low;
    }
}
