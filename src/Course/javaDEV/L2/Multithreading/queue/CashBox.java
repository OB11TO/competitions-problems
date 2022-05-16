package Course.javaDEV.L2.Multithreading.queue;

public class CashBox { // касса

    private static int generator = 1;
    private int id;

    public CashBox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "CashBox{" + "id=" + id +
                '}';
    }
}
