package course.multithreading.javacore.dmdev.lesson25_6;

import java.util.List;

public class ListThread extends Thread {

    private final List<Integer> list;

    public ListThread(List<Integer> integers) {
        this.list = integers;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4000; i++) {
//            synchronized (list) {
            list.add(i);
//            }
        }
    }
}
