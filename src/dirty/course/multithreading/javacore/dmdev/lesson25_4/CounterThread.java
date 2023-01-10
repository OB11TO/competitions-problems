package dirty.course.multithreading.javacore.dmdev.lesson25_4;

/**
 * 2. Создать класс CounterThread c одним полем и конструктором для инициализации:
 * private Counter counter;
 * <p>
 * В методе run этого класса в цикле 100 раз вызвать counter.increment()
 */

public class CounterThread implements Runnable {

    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        int i = 10000;
        while (i > 0) {
            counter.increment();
            i--;
        }
    }


    public Counter getCounter() {
        return counter;
    }
}
