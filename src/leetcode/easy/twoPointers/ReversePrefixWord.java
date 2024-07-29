package leetcode.easy.twoPointers;

/*
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 */
public class ReversePrefixWord {

    public static void main(String[] args) {
        System.out.println(reversePrefix2("abcdefd", 'd'));
        System.out.println(reversePrefix2("xyxzxe", 'z'));
        System.out.println(reversePrefix2("abcd", 'z'));
        System.out.println(reversePrefix2("j", 'j'));
    }

    /**
     * Решение без двух указателей
     * @param word
     * @param ch
     * @return
     */
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ch) {
                sb.append(word.charAt(i));
            }
            else if(word.charAt(i) == ch) {
                sb.append(word.charAt(i));
                index = word.indexOf(ch, index);
                sb.reverse();

                for(int l = index + 1; l < word.length(); l++) {
                    sb.append(word.charAt(l));
                }
                break;
            }
        }
        return sb.toString();
    }

    /*
    Оптимальное решение
     */
    public static String reversePrefix2(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index = word.indexOf(ch);
        for(int r = index; r != -1; r--) {
            sb.append(word.charAt(r));
        }
        for(int r = index + 1; r < word.length(); r++) {
            sb.append(word.charAt(r));
        }
        return sb.toString();
    }

    public static String reversePrefix3(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {return word;}
        char[] chars = word.toCharArray();
        int left = 0;
        int right = index;
        while(left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }
}
