package dirty.course.multithreading.javacore.dmdev.lesson25_4;


/**
 * 3. В методе main создать 4 потока типа CounterThread,
 * передав один и тот же объект Counter и запустить их, дождаться выполнения
 * и вывести на консоль в текущее значение нашего счетчика:
 * counter.getCount()
 */
public class CounterRunner {

    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        Thread thread1 = new Thread(counterThread1);

        CounterThread counterThread2 = new CounterThread(counter);
        Thread thread2 = new Thread(counterThread2);

        CounterThread counterThread3 = new CounterThread(counter);
        Thread thread3 = new Thread(counterThread3);

        CounterThread counterThread4 = new CounterThread(counter);
        Thread thread4 = new Thread(counterThread4);

        CounterThread counterThread5 = new CounterThread(counter);
        Thread thread5 = new Thread(counterThread5);

        CounterThread counterThread6 = new CounterThread(counter);
        Thread thread6 = new Thread(counterThread6);

        CounterThread counterThread7 = new CounterThread(counter);
        Thread thread7 = new Thread(counterThread7);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
