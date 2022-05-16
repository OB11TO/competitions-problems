package Course.javaDEV.L2.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Написать метод markLength4, принимающий в качестве параметра список (List)
 * строк и размещающий строку "****" перед каждым
 * четырёхсимвольным элементом. Оригинальные элементы должны остаться на месте.
 *           Например:
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 * ->
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
 */

public class HW {
    public static void main(String[] args) {
       // List<String> strings = Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
        List<String> strings = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        markLength4(strings);

        System.out.println(strings);
    }

    public static void markLength4(List<String> strList){
        ListIterator<String> listIterator = strList.listIterator();

        while(listIterator.hasNext()){
            String next = listIterator.next();
            if(next.length() == 4){
                listIterator.set("****");
                listIterator.add(next);


            }
        }
    }
}
