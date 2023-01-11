package leetcode.easy.neetcode.arrays_hashing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        var s1 = "anagram";
        var s2 = "naagrak";

        System.out.println(isAnagram2(s1, s2));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        var sChar = s.toCharArray();
        var tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        var s1 = new String(sChar);
        var t1 = new String(tChar);

        return s1.equals(t1);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}
