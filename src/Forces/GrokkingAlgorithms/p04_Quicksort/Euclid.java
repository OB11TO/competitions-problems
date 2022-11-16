package Forces.GrokkingAlgorithms.p04_Quicksort;

/**
 * Реализация алгоритма Евклида
 */
public class Euclid {

    public static void main(String[] args) {
        System.out.println(searchEuclid(1680, 640)); //80
        System.out.println(searchEuclid(168, 64)); //80
    }

    private static int searchEuclid(int first, int second) {
        if (second == 0) {
            return first;
        }
        return searchEuclid(second, first % second);
    }
}
