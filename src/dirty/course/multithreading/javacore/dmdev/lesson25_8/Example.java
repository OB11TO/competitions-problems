package dirty.course.multithreading.javacore.dmdev.lesson25_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Read - only объект
 */
public class Example {

    private final List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
//        this.list = List.copyOf(list);  неизменяемая коллекция

    }

    public List<Integer> getList() {
        return new ArrayList<>(list); //read-only object
    }
}
