package section001_classes;

public class DynaArray {
    int[] result = new int[5];
    int counter;

    public void add( int val) {
        if(counter == result.length){
            int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        result[counter++] = val;
    }
}
