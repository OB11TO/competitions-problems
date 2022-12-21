package leetCode.Easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *  <p>
 *  <p>
 *  <p>
 * Временная сложность : O(S) , где S - сумма всех символов во всех строках.
 *<p>
 * В худшем случае все nnn строки одинаковы. Алгоритм сравнивает строку S1[ с другими строками [S2...Sn]
 * Есть такие SSS сравнения символов, где SSS является суммой всех символов во входном массиве.
 *<p>
 * Сложность пространства : O(1). Мы использовали только постоянное дополнительное пространство.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = new String[]{"flower"};
        System.out.println(longestCommonPrefix(strings));

//        String a = "artem";
//        String b = "artrrr";
//
//        var i = a.indexOf(b);
//        System.out.println(i);
    }

    /**
     * Алгоритм - горизонтальное сканирование
     * Суть в том, что изначально берем первое слово за префикс.
     * Далее пока indexOf не вернет true(0), удаляем последний символ в prefix
     * Если prefix empty => нет общего prefix для строк
     * @param strs - массив строк
     * @return - prefix для общих строк
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
