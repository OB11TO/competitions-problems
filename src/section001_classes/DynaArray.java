package section001_classes;

import java.util.Arrays;

public class DynaArray {
    private int[] result;
    private int counter;

    public DynaArray() {
        this.counter = 0;
        this.result = new int[5];
    }

    public DynaArray(int size) {
        this.result = new int[size];
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public void add(int val) {
        if (counter == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[counter++] = val;
    }

    private void add(int val, int num) {
        if (result.length - counter < num) {
            grow(counter + num);
        }
        result[counter++] = val;

    }

    private void grow(int length) {
        int[] newArray = new int[length];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    public void add(int[] array) {
        int num = array.length;
        for (int val : array) {
            add(val, num);
            num--;
        }
    }

    public void add(DynaArray dynaArray) {
        int num = dynaArray.result.length;
        for (int i = 0; i < dynaArray.counter; i++) {
            add(dynaArray.result[i], num);
            num--;
        }
    }

    public int[] toArray() {
        return Arrays.copyOf(result, counter);
    }

    public String asString() {
        final StringBuilder sb = new StringBuilder().append('[');
        for (int i = 0; i < counter; i++) {
            sb.append(result[i]);
            if (i < counter - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    public void clear() {
        //Arrays.fill(result, 0, result.length, 0);
        //this.result = new int[result.length];
        for (int i = result.length; i > 0; i--) {
            result[i - 1] = 0;
        }
        counter = 0;

    }

    public void remove(int val) {
        int index = indexOf(val);
        if (index != -1) {
            removeDetail(index);
        }
    }

    private int indexOf(int val) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] == val) {
                return i;
            }
        }
        return -1;
    }


    private void removeDetail(int index) {
        if (counter - 1 - index >= 0)
            System.arraycopy(result, index + 1, result, index, counter - 1 - index);
        counter--;
    }

    public int size() {
        return counter;
    }

    public boolean contains(int val) {
        return indexOf(val) != -1;
    }
}
