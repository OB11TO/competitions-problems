package section001_classes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, -4, 5};
        DynaArray result = getPositiveNumbers(array);

        for(int i = 0; i < result.counter; i++){
            System.out.print(result.result[i]+ " ");
        }
        System.out.println();
    }

    private static DynaArray getPositiveNumbers(int[] array) {
        int[] result = new int[array.length];
        int counter = 0;
        for(int val : array){
            if(val > 0){
                result[counter++] = val;
            }
        }
        DynaArray dynaArray = new DynaArray();
        dynaArray.result = result;
        dynaArray.counter = counter;
        return dynaArray;
    }
}