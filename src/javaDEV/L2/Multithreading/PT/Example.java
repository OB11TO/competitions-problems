package javaDEV.L2.Multithreading.PT;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private final List<Integer> list;

    public Example(List<Integer> list) {
        //this.list = list; список mutable
       // this.list = List.copyOf(list); //создается новый список
        this.list = list;
    }

    public List<Integer> getList() {
       // return list;
        return new ArrayList<>();
    }
}
