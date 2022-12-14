package forces.grokkingAlgorithms.p04_Quicksort;

/**
 * Реализация алгоритма Евклида
 * O (Log min (n1, n2)
 */
public class Euclid {

    public static void main(String[] args) {
        System.out.println(searchEuclid(1680, 640)); //80
        System.out.println(searchEuclid(400, 64)); //16
    }

    private static int searchEuclid(int first, int second) {
        if (second == 0) {
            return first;
        }
        return searchEuclid(second, first % second);
    }
}
