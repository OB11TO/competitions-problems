package course.multithreading.javacore.dmdev.lesson25_12;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int random = RandomUtil.getRandom();
                    list.add(random);
                    System.out.println("producer add value: " + random + ". Size " + list.size());
                } else {
                    System.out.println("producer does nothing");
                }
                try {
                    int randomValue = 1000;
                    System.out.println("producer waits: " + randomValue);
                    list.wait(randomValue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
