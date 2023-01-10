package dirty.course.javaDEV.L2.Multithreading.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
            synchronized (cashBoxes) {
                while (true) {
                if (!cashBoxes.isEmpty()) {
                    CashBox cashBox = cashBoxes.remove();
                    System.out.println(Thread.currentThread().getName() + " обслуживается " + cashBox);


                    try {
                        cashBoxes.wait(5L);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    System.out.println(Thread.currentThread().getName() + " освобождает) " + cashBox);
                    cashBoxes.add(cashBox);
                    cashBoxes.notifyAll();
                    break;
                } else {

                    System.out.println(Thread.currentThread().getName() + " ожидает ");

                    try {
                        cashBoxes.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

    }
}
