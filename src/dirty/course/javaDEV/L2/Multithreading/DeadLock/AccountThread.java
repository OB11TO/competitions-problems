package dirty.course.javaDEV.L2.Multithreading.DeadLock;

public class AccountThread  extends  Thread{
    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    /**
     *  ----- account1 -> account2
     *  ----- account2 -> account1
     */

    @Override
    public void run() {
        synchronized (accountFrom){
            synchronized (accountTo){
                for (int i = 0; i < 2000; i++) {
                    if(accountFrom.takeOff(10)){
                        accountTo.add(10);
                    }
                }
            }
        }
    }
}
