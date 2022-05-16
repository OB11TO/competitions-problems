package Course.javaDEV.section001_classes;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fullTime = scanner.nextLong();
        printTime(fullTime);
    }

    protected static void printTime(long fullTime) {
        int h = 0;
        int m = 0;
        int s = 0;

        if (fullTime >= 86400) fullTime %= 86400;

        if (fullTime < 60L) {
            s = (int) fullTime;
        } else if (fullTime < 60L * 60L) {
            m = (int) (fullTime / (60));
            fullTime -= m * 60;
            s = (int) (fullTime);
        } else {
            h = (int) (fullTime / (60 * 60)); //131
            fullTime -= h * (60 * 60);
            m = (int) (fullTime / (60));
            fullTime -= m * 60;
            s = (int) (fullTime);
        }

        System.out.println((h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s));
 /*       System.out.println(print(h) + ":" + print(m) + ":" + print(s));
    }
    protected static String print(int t){
        if(t < 10){
            return "0" + t;
        }else
            return "" + t;
    }
*/
    }
}


