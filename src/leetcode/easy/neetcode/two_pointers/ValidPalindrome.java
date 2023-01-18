package leetcode.easy.neetcode.two_pointers;

import java.awt.print.Pageable;
import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(str));
    }


    public static boolean isPalindrome2(String s) {
        int left = 1;
        int right = s.length() - 1;

        while (left < right) {
            char start = s.charAt(left);
            char end = s.charAt(right);

            if (!Character.isLetterOrDigit(start)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(right)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        var str = s.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]|\\s+", "").toLowerCase();
        System.out.println(str);
        String newStr = new StringBuilder(str).reverse().toString();

        return str.equals(newStr);
    }
}


