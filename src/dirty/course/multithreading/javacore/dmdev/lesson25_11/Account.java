package dirty.course.multithreading.javacore.dmdev.lesson25_11;

public class Account {

    private static int generator = 1;
    private final int id;
    private int money;

    public Account(int money) {
        this.id = generator++;
        this.money = money;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Account{" + "generator=" + generator +
                ", id=" + id +
                ", money=" + money +
                '}';
    }

    public int getGenerator() {
        return generator;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }
}
