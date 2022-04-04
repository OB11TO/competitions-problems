package javaDEV.L2.Generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class MainTest {
    public static void main(String[] args) {
        ListObject<String> objects = new ListObject<>(5);

        objects.add("1");
        objects.add("1");
        objects.add("F");
        objects.add("Str");

      for(Iterator<String> iterator = objects.iterator(); iterator.hasNext(); ){
          System.out.println(iterator.next());
      }

        System.out.println(objects.get(3));

        for(String s : objects){
            System.out.println(s);
        }

        objects.iterator().forEachRemaining(System.out::println);
    }
}
