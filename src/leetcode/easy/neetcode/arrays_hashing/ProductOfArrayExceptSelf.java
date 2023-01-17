package leetcode.easy.neetcode.arrays_hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf2(new int[]{5, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = 0;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int sum = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i !=j) {
                    sum = sum * nums[j];
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}
