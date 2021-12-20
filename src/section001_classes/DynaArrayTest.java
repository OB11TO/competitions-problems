package section001_classes;

import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray(0);
        DynaArray dynaArray2 = new DynaArray(0);

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println(dynaArray1.getCounter());

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        System.out.println(dynaArray2.getCounter());

        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(4);
        dynaArray1.add(5);
        dynaArray1.add(5);
        dynaArray1.add(5);

        System.out.println("------------------------------------");
        System.out.println(dynaArray1.asString());
        System.out.println("------------------------------------");
        dynaArray1.add(new int[]{2, 4});
        dynaArray2.add(dynaArray1);

        System.out.print("dynaArray1: ");
        System.out.print(Arrays.toString(dynaArray1.toArray()) + " ");
        System.out.println(dynaArray1.getCounter());

        System.out.print("dynaArray2: ");
        System.out.print(Arrays.toString(dynaArray2.toArray()) + " ");
        System.out.println(dynaArray2.getCounter());
    }
}