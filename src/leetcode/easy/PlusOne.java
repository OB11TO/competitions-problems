package leetcode.easy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] nums = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 9};
        int[] nums2 = {9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println(Arrays.toString(plusOne(nums2)));

    }

    public static int[] plusOne(int[] digits) {
//        String res = Arrays.toString(digits).replaceAll("[\\[\\],]", "");
//        var resultNum = res.replaceAll("\\s", "");
//        var number = Long.parseLong(resultNum);
//        number = number + 1;
//        var newStr = String.valueOf(number);
//        int[] preArray = new int[newStr.length()];
//        var split = newStr.split("(?!^)");
//
//        for(int i = 0; i < split.length; i++) {
//            preArray[i] = Integer.parseInt(split[i]);
//        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;

            }
        }
        if(digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
