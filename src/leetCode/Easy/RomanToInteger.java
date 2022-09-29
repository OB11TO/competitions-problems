package leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Римские цифры представлены семью различными символами: I, V, X, L, C, D и M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * Например, 2 записывается как II римской цифрой, просто две единицы складываются вместе. 12 записывается как XII,
 * что означает просто X + II. Число 27 записывается как XXVII, то есть XX + V + II.
 * <p>
 * Римские цифры обычно пишутся от наибольшего к 00 слева направо. Однако цифра, обозначающая четыре,
 * не является IIII. Вместо этого число четыре  00записывается как IV. Поскольку единица стоит перед пятеркой,
 * мы вычитаем ее, получая четыре. Тот же принцип п00рименим и к числу девять, которое записывается как IX.
 * Существует шесть случаев, когда используется вычитание:
 * <p>
 * I может быть помещен перед V (5) и X (10), чтобы сделать 4 и 9.
 * X можно поместить перед L (50) и C (100), чтобы получить 40 и 90.
 * C можно поместить перед D (500) и M (1000), чтобы получить 400 и 900.
 * Учитывая римскую цифру, преобразуйте ее в целое число.
 */

public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String number = "III";
        int result = solution.romanToInt(number);
        System.out.println(result);

    }
}

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        int sum = map.get(s.charAt(len - 1));

        for(int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
