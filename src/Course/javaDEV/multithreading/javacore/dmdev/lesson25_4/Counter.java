package Course.javaDEV.multithreading.javacore.dmdev.lesson25_4;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1. Создать класс Counter с одним полем
 * и добавить методы
 */
public class Counter {

    //    private int count;
    private final AtomicInteger count = new AtomicInteger();

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
