package javaDEV.L2.Generics;

public class MainTest {
    public static void main(String[] args) {
        ListObject<String> objects = new ListObject<>(5);

        objects.add("1");
        objects.add("1");
        objects.add("12");
        objects.add("Str");

        System.out.println(objects.get(3));
    }
}
