package javaDEV.L2.Multithreading.Prac;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;

/**
 * Задан LinkedList, представляющий собой хранилище целых чисел.
 * <p>
 * Поток ProducerThread c какой-то периодичностью бесконечно
 * добавляет в этот список случайные числа,
 * однако максимальное количество, которое он может
 * добавить, равно 10.
 * <p>
 * Поток ConsumerThread бесконечно считывает числа с какой-то случайной
 * задержкой (от 0 до 10 мс).
 * <p>
 * Сделать так, чтобы метод produce добавлял числа только тогда,
 * когда не превышен лимит, а метод consume забирал их только
 * тогда, когда в списке что-нибудь есть.
 * При этом методы должны корректно работать в многопоточной
 * среде.
 * <p>
 * Создать и запустить два различных потока, один из которых
 * вызывает produce, а другой - consume.
 * Продемонстрировать корректность работы хранилища с помощью
 * вывода сообщений в консоль о добавлении, получении и текущем
 * размере хранилища на этапах добавления и получения.
 */

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> numbers = new LinkedList<>();
        Thread producerThread = new Thread(new ProducerThread(numbers));
        Thread consumerThread = new Thread(new ConsumerThread(numbers));

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();



    }
}

class ProducerThread implements Runnable {
    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> numbers) {
        this.list = numbers;
    }


    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int random = RandomUtils.getRandom();
                    list.add(random);
                    System.out.println("producer adds value: " + random + ". Size " + list.size());
                } else {
                    System.out.println("producer does nothing");
                }
//               list.notifyAll();
                try {
                    int randomWaitValue = 20;
                    System.out.println("producer waits: " + randomWaitValue);
                    list.wait(randomWaitValue);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }

    }
}

record ConsumerThread(Queue<Integer> list) implements Runnable {

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("consumer get value: " + removedValue + ". Size: " + list.size());
                } else {
                    System.out.println("consumer is waiting, list is empty");
                }
                try {
                    int random = 80;
                    System.out.println("consumer waits: " + random);
//                   list.notifyAll();
                    list.wait(random);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ConsumerThread) obj;
        return Objects.equals(this.list, that.list);
    }

    @Override
    public String toString() {
        return "ConsumerThread[" +
                "list=" + list + ']';
    }

}

final class RandomUtils {

    private final static Random RANDOM = new Random();
    private static final int DEFAULT_BOUND = 10;

    private RandomUtils() {

    }

    public static int getRandom() {
        return RANDOM.nextInt(DEFAULT_BOUND);
    }


}
