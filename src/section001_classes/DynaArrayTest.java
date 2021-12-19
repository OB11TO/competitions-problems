package section001_classes;

import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();

        dynaArray1.add(1);
        dynaArray1.add(2);

        dynaArray2.add(34);

        System.out.println(dynaArray1.counter);
        System.out.println(Arrays.toString(dynaArray1.result));
        System.out.println(dynaArray2.counter);
    }
}