package Course.javaDEV.L2.Multithreading;

import Course.javaDEV.L2.Multithreading.PT.Example;

import java.util.ArrayList;
import java.util.List;

public class ExampleRunner {
    public static void main(String[] args) {
        Example example = new Example(new ArrayList<>());

        List<Integer> list = example.getList();

      //  list.add(2);  //можем изменить список
        //  list.add(2);  после изменения на List.copyOf нельзя изменить список UnsupportedOperationException
        //Теперь если не делать таких жесткий ограничений и на getList возвращать новый список, но при этом убрать List.copyOf
        list.add(2); //добавим элемент, но первоначальный список не изменится

        //еще один способ на каждый метод повесить synchronized


        System.out.println(list);
       // System.out.println(example.getList()); //список меняется
        System.out.println(example.getList()); // с 3 пунктом нет
    }
}
