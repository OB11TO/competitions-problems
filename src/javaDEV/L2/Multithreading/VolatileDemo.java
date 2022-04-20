package javaDEV.L2.Multithreading;

public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("NO");
            }
        });
        thread1.start();

        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("Yes");

        });
        thread2.start();

    }
}
