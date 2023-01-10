package dirty.course.multithreading.javacore.dmdev.lesson25_7;

public class VolatileDemo {

    private static volatile boolean flag = false; //не оптимизирует (не положит в кэш потока)

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread( () -> {
            while (!flag) {
                System.out.println("FALSE");
            }
        });
        thread1.start();
        Thread.sleep(5L);

        var thread2 = new Thread(() -> {
            flag = true;
            System.out.println("TRUE");
        });
        thread2.start();
    }
}
