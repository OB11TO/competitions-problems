package course.multithreading.javacore.dmdev.lesson25_12;

import java.util.LinkedList;
import java.util.Queue;

public class TaskDemo {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> list = new LinkedList<>();

        Thread producer = new Thread(new ProducerThread(list));
        Thread consumer = new Thread(new ConsumerThread(list));

        producer.start();
        consumer.start();

        producer.join();
        producer.join();
    }
}
