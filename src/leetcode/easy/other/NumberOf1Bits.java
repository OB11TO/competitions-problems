package leetcode.easy.other;

public class NumberOf1Bits {

    public static void main(String[] args) {

    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
       return Integer.bitCount(n);
    }
}

