package Course.javaDEV.lambda.comparableTest;

public class Array {

    public static void main(String[] args) {
        Integer[] arrays = new Integer[]{2, 1, 5, 3, 8, 6};
        Integer max = max(arrays);
        System.out.println(max);

    }

    private static <T extends Comparable<T>> T max(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }

   /* public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }*/
}
