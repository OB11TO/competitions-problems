package dirty.course.multithreading.javacore.dmdev.lesson25_8;

import java.util.List;

public class ExampleRunner {

    public static void main(String[] args) {
        var example = new Example(List.of(1323));
        var list = example.getList();
        list.add(5);

        System.out.println(example.getList());
        System.out.println(list);
    }
}
