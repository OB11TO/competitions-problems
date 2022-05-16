package Course.javaDEV.section001_classes;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, -4, 5};
        DynaArray result = getPositiveNumbers(array);

        for(int i = 0; i < result.getCounter(); i++){
            System.out.print(result.getResult()[i]+ " ");
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
        dynaArray.setResult(result);
        dynaArray.setCounter(counter);
        return dynaArray;
    }
}