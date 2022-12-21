package leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(11));
        System.out.println(3%10);

    }
    public static boolean isPalindromeUsingString(int x) {
        String str = String.valueOf(x);
        var stringReverse = new StringBuilder(str).reverse().toString();
        return str.equals(stringReverse);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int copyX = x;
        int reverseNumber = 0;
        while (copyX !=0 ){
            reverseNumber = reverseNumber * 10 + copyX % 10;
            copyX = copyX/10;
        }
        return x == reverseNumber;
    }
}
