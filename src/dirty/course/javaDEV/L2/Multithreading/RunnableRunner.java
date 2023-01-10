package dirty.course.javaDEV.L2.Multithreading;

public class RunnableRunner implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable " + Thread.currentThread().getName());
    }
}
