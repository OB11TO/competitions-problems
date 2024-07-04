package leetcode.easy.hashTable;

import java.util.HashMap;
import java.util.Map;

public class PermutationDifferenceBetweenTwoStrings {

    public static void main(String[] args) {

    }

    public int findPermutationDifference(String s, String t) {
        // формула |x0 - y0| + |x1 - y1| + ... + |xn - yn| = z
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int result = 0;
        char[] arrayS = s.toCharArray();
        char[] arrayT = s.toCharArray();
        for(int i = 0; i < s.length(); i++ ) {
            map1.put(arrayS[i], i);
            map2.put(arrayT[i], i);
        }

        for(Map.Entry<Character, Integer> element : map1.entrySet()) {
            Character ch = element.getKey();
            result = result + Math.abs(element.getValue() - map2.get(ch));
        }
        return result;
    }

    public int findPermutationDifferenceOptimal(String s, String t) {
        // формула |x0 - y0| + |x1 - y1| + ... + |xn - yn| = z
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = t.indexOf(ch);
            result+= Math.abs(i - j);
        }
        return result;
    }
}
