package javaDEV.L2.Multithreading.Task;

/**
 * 1. Создать класс Counter с одним полем:
 * * private int count;
 * *
 * * Добавить методы:
 * * - getCount() - для получения поля count
 * * - increment() - для увеличения значения поля на единицу
 * * - decrement() - для уменьшения значения поля на единицу
 * *
 */
public class Counter {
    private static String name;
    private int count;

    public static void init() {
        synchronized (Counter.class) {
            if (name == null) {
                name = "Disc";
            }
        }
    }

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }

    public void decrement() {
        synchronized (this) {
            count--;
        }
    }
}
