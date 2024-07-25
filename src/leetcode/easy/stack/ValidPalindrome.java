package leetcode.easy.stack;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("."));
        System.out.println(isPalindrome(".,"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("aa"));
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));

    }

    public static boolean isPalindrome(String s) {
        if(s.equals(" ")) return true;
        if(s.length()==1) return true;
        s = s.toLowerCase().replaceAll("[^a-zA-Za-яА-Я0-9]", "").replaceAll("[{}]", "");;
        if(s.isEmpty()) return true;
        int l = 0;
        int r = s.length() - 1;
        while(l <= r) {
            if(s.charAt(l) == s.charAt(r)) {
                l += 1;
                r -= 1;
            }
            else {return false;}
        }
        return true;
    }
}
