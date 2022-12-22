package course.multithreading.javacore.dmdev.lesson25_11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountRunner {
    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(4000);
        Account account2 = new Account(4000);

        AccountThread accountThread1 = new AccountThread(account1, account2);
        AccountThread accountThread2 = new AccountThread(account2, account1);

        var collects = Stream.of(
                        accountThread1,
                        accountThread2
                )
                .map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());

        for (Thread thread : collects){
            thread.join();
        }

        System.out.println(account1.getMoney());
        System.out.println(account2.getMoney());

    }
}
