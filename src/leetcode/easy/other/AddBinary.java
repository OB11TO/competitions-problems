package leetcode.easy.other;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * <p></p>
 * Input: a = "11", b = "1"
 * Output: "100"
 */
public class AddBinary {

    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "1010";
        System.out.println(addBinary(s1, s2));
    }


    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        var i = a.length() - 1;
        var j = b.length() - 1;
        int sum = 0;

        while (i >= 0 || j >=0) {
            if(i >=0) sum += a.charAt(i--) - '0';
            if(j >=0) sum += b.charAt(j--) - '0';
            sb.append(sum %2);
            sum = sum /2;

        }
        if (sum != 0) sb.append(sum);
        return sb.reverse().toString();
    }
}
