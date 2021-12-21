package section001_classes;

import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray1 = new DynaArray();
        DynaArray dynaArray2 = new DynaArray();

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

class DynaArrayTest2 {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);

        dynaArray.add(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});

        DynaArray dynaArray2 = new DynaArray();
        dynaArray2.add(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1, 0});
        dynaArray.add(dynaArray2);

        dynaArray.add(99);
        dynaArray.add(98);
        dynaArray.add(97);

        // [0, 1, 2, 3, 4, 5, 9, 8, 7, 6, 5, 4, 3, 2, 1, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 99, 98, 97]
        System.out.println(dynaArray.asString());
    }
}

class DynaArrayTest3 {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray(0);
        dynaArray.add(0);
        System.out.println(dynaArray.asString());
    }
}

class DynaArrayTest4 {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);

        System.out.println(dynaArray.asString());

        dynaArray.clear();

        System.out.println(dynaArray.asString());
    }
}

class DynaArrayTest5 {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);

        System.out.println(dynaArray.asString());

        dynaArray.remove(5);
        // [0, 1, 2, 3]
        System.out.println(dynaArray.asString());

        dynaArray.remove(0);
        // [1, 2, 3]
        System.out.println(dynaArray.asString());

        dynaArray.remove(2);
        // [1, 3]
        System.out.println(dynaArray.asString());
    }
}

class DynaArrayTest6 {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);

        System.out.println(dynaArray.size());
    }
}
class DynaArrayTest7 {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);

        System.out.println(dynaArray.contains(0));
        System.out.println(dynaArray.contains(2));

        System.out.println(dynaArray.contains(100));
        System.out.println(dynaArray.contains(-3));
    }
}
