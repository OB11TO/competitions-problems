package dirty.thread;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SequenceThreadFrameSber {

    static class DoubleLock {
        boolean first = true;
        boolean second = false;

        synchronized void firstDone() {
            first = false;
            second = true;
            notify();
        }

        synchronized void secondDone() {
            first = true;
            second = false;
            notify();
        }

        synchronized void firstWait() {
            while (second) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        synchronized void secondWait() {
            while (first) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            System.out.println(new SequenceThreadFrameSber().sequence());
        }
    }


    /**
     * Нужно сделать так, чтобы менялись по очереди
     *
     * @return
     * @throws InterruptedException
     */
    private List<String> sequence() throws InterruptedException {
        var out = new CopyOnWriteArrayList<String>();
        DoubleLock lock = new DoubleLock();
        var first = new Thread(
                () -> {
                    for (int i = 0; i < 3; i++) {
                        lock.firstWait();
                        out.add("first");
                        lock.firstDone();
                    }
                }
        );
        var second = new Thread(
                () -> {
                    for (int i = 0; i < 3; i++) {
                        lock.secondWait();
                        out.add("second");
                        lock.secondDone();
                    }
                }
        );
        first.start();
        second.start();
        first.join();
        second.join();
        return out;
    }

    /**
     * Нужно сделать так, чтобы менялись по очереди
     *
     * @return
     * @throws InterruptedException
     */
    private List<String> sequence2() throws InterruptedException {
        var out = new CopyOnWriteArrayList<String>();
        Object lock = new Object();
        var first = new Thread(
                () -> {
                    for (int i = 0; i < 3; i++) {
                        synchronized (lock) {
                            try {
                                out.add("first");
                                lock.notify();
                                if (i < 2) {
                                    lock.wait();
                                }
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
        );
        var second = new Thread(
                () -> {
                    for (int i = 0; i < 3; i++) {
                        synchronized (lock) {
                            try {
                                out.add("second");
                                lock.notify();
                                if (i < 2) {
                                    lock.wait();
                                }
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
        );
        first.start();
        second.start();
        first.join();
        second.join();
        return out;
    }
}
