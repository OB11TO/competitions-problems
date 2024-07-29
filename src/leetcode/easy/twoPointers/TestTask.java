package leetcode.easy.twoPointers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTask {

    public static void main(String[] args) {

        System.out.println(countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2));
        System.out.println(countPairs(Arrays.asList(-6,2,5,-2,-7,-1,3), -2));
    }

    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int r = nums.size() - 1;
        int result = 0;
        for (int l = 0; l <= r; l++) {
            while(l <= r && nums.get(l) + nums.get(r) >= target) {
                r--;
            }
            result += r - l;
        }
        return result;
    }

    /**
     * Дана отсортированная последовательность чисел длиной N и число K
     * Необходимо найти количество пар чисел A B таких что B - A > K
     * @param nums
     * @param k
     * @return
     */

    public static int cntPairs(int[] nums, int k) {
        int result = 0;
        int r = 0;
        for(int l = 0; l < nums.length; l++) {
            while(r < nums.length && nums[r] - nums[l] <= k) {
                r++;
            }
            result = result + nums.length - r;
        }

        return result;
    }

    /**
     * Команда называется сплоченной, если проф. любоого игрока не превосходит суммарный проф. любых двух других игроков из команды.
     * @param nums
     * @param k
     * @return
     */
    public static int cntPairsFB(int[] nums, int k) {
        int result = 0;

        return result;
    }
}
