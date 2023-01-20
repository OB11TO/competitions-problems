package leetcode.easy.neetcode.two_pointers;

public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int first, second;

        while (left < right) {
            first = numbers[left];
            second = numbers[right];

            if(first + second == target) break;
            if(first + second < target) {
                left++;
                continue;
            }
            right--;
        }

        return new int[] {++left, ++right};
    }
}
