package leetcode.easy.queue;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * Example 1:

 * Input: s = "leetcode"
 * Output: 0
 * Example 2:

 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:

 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacterString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
