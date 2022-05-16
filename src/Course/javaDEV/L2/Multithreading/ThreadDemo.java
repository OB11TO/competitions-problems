package Course.javaDEV.L2.Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        var newThread = new ThreadRunner();
        System.out.println(newThread.getState() + " - " + newThread.getName());
        var threadRunner = new Thread(new RunnableRunner());
        var threadLambda = new Thread(() -> System.out.println("Lambda " + Thread.currentThread().getName()));

        newThread.start();
        System.out.println(newThread.getState() + " - " + newThread.getName());
        threadLambda.start();
        threadRunner.start();
        try {
            newThread.join(); // Ждет, пока этот поток умрет.
            System.out.println(newThread.getState() + " - " + newThread.getName());
            threadLambda.join();
            threadRunner.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}
