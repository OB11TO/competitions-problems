package section001_classes;

import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] array = {1, -2, -3, -4, -5};
        int[] result = getPositiveNumbers(array);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+ " ");
        }
        System.out.println();
    }

    private static int[] getPositiveNumbers(int[] array) {
        int[] result = new int[array.length];
        int counter = 0;
        for(int val : array){
            if(val > 0){
                result[counter++] = val;
            }
        }
        return Arrays.copyOf(result,counter);
    }
}
