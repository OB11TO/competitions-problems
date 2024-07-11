package leetcode.easy.hashTable;

/**
 * Логика, лежащая в основе моего кода:
 *
 * Однозначные числа, кроме 1 и 7, не являются счастливыми числами.
 * Итак, если n == 1 или n == 7, то напрямую возвращает true.
 * В противном случае выполняйте цикл до тех пор, пока n> 9, т.е. Когда количество цифр больше 1.
 * Внутри этого основного цикла получите доступ к отдельным цифрам числа (n) и выполните операцию возведения в квадрат с последующей суммой.
 * Если эта сумма равна 1 или 7, то мы можем вернуть true. В противном случае продолжайте цикл, пока сумма не станет однозначным числом.
 * Наконец, если 1 или 7 не отображаются, верните false.
 */

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        while(true) {
            if(n < 10 && n != 1 && n != 7) {
                return false;
            }
            n = sumSquaresDigit(n);
            if(n == 1) {
                return true;
            }
        }
    }

    public static int sumSquaresDigit(int n) {
        int result = 0;
        while(n > 0) {
            int second = n % 10;
            result += second*second;
            n /= 10;
        }

        return result;
    }
}
