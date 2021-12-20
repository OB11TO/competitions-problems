package section001_classes;

import java.util.Arrays;

public class DynaArray {
    int[] result = new int[5];
    int counter;

    public void add(int val) {
        if (counter == result.length) {
            int[] newArray = new int[result.length * 2];
            System.arraycopy(result, 0, newArray, 0, result.length);
            result = newArray;
        }
        result[counter++] = val;
    }

    public int[] toArray() {
        return Arrays.copyOf(result, counter);
    }

    public String asString() {
        final StringBuilder sb = new StringBuilder().append('[');
        for (int i = 0; i < counter; i++) {
            sb.append(result[i]);
            if(i < counter - 1){
                sb.append(", ");
            }
        }
     /*
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1).append("]");
        }

      */

        return sb.append("]").toString();
    }
}
