package dirty.forces.tinkoffTaskSchool.kontest;

import java.util.Scanner;

/**
 * https://edu.tinkoff.ru/selection/76378fbd-1998-48fa-944e-eb736d321f11/exam/244?task=1
 * <p>
 * 100  10  12  15 -> 160
 * 100  10  12  1  -> 100
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int A = scanner.nextInt();
        final int B = scanner.nextInt();
        final int C = scanner.nextInt();
        final int D = scanner.nextInt();

        if(D - B < 0){
            System.out.println(A);
        }
        else{
            System.out.println(A + (C * (D - B)));
        }
    }
}
