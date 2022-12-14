package course.multithreading.javacore.dmdev.lesson25_4;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1. Создать класс Counter с одним полем
 * и добавить методы
 */
public class Counter {

    //    private int count;
    private static String description;
    private final AtomicInteger count = new AtomicInteger();

    public static void init() {
        synchronized (Counter.class) {
            if (description == null) {
                description = "Test";
            }
        }
    }

    public void increment() {
//        count++;  не атомарна
        count.incrementAndGet();
    }

    public synchronized void decrement() {
        count.getAndDecrement();
    }

    public AtomicInteger getCount() {
        return count;
    }
}
