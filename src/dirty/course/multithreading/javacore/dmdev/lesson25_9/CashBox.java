package dirty.course.multithreading.javacore.dmdev.lesson25_9;

public class CashBox {

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
