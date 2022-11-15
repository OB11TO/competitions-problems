package Forces.GrokkingAlgorithms.p03_Recursion.t01_countdown;

public class Countdown {
    private static void countdown(int i) {
        System.out.println(i);

        // base case
        if (i <= 0) {
            return;
        } else {
            countdown(i - 1);
        }
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
