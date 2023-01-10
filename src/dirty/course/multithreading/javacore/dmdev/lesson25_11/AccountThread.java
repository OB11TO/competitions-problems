package dirty.course.multithreading.javacore.dmdev.lesson25_11;

public class AccountThread implements Runnable {

    private final Account accountTo;
    private final Account accountFrom;

    public AccountThread(Account accountTo, Account accountFrom) {
        this.accountTo = accountTo;
        this.accountFrom = accountFrom;
    }

    @Override
    public void run() {
        synchronized (accountTo) {
            synchronized (accountFrom) {
                for (int i = 0; i < 100; i++) {
                    if(accountFrom.takeOff(20)) {
                        accountTo.add(20);
                    }
                }
            }
        }
    }
}
