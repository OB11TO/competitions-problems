package dirty.course.javaDEV.section001_classes;

public class ClassFieldVsLocalVar {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 8, 9, 5, 6, 34};
        DynaArray result = getPositiveNumbers(array);

        for(int i = 0; i < result.getCounter(); i++){
            System.out.print(result.getResult()[i]+ " ");
        }
        System.out.println();
    }

    private static DynaArray getPositiveNumbers(int[] array) {
        DynaArray dynaArray = new DynaArray();
        for(int val : array){
            if(val > 0){
                dynaArray.add(val);
            }
        }

        return dynaArray;
    }
}