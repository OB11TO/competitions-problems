package Course.javaDEV.L2.Multithreading;

public class ThreadRunner extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + getName());   //getName т.к. класс наследуется от Thread
    }
}
