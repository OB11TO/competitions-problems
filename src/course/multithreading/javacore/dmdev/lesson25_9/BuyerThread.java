package course.multithreading.javacore.dmdev.lesson25_9;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }


    @Override
    public void run() {
        try {
            synchronized (cashBoxes) {
                while (true) {
                    if (!cashBoxes.isEmpty()) {
                        CashBox cashBox = cashBoxes.remove(); //извлекает и удаляет кассу из очереди
                        System.out.println(Thread.currentThread().getName() + "обслуживается в кассе " + cashBox);

                        cashBoxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + "выхожу из кассы " + cashBox);
                        cashBoxes.add(cashBox);
                        cashBoxes.notifyAll();
                        break;

                    } else {
                        System.out.println(Thread.currentThread().getName() + "ждем свободную кассу");
                        cashBoxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
