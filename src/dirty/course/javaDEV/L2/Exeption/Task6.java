package dirty.course.javaDEV.L2.Exeption;

import java.util.Map;
import java.util.Random;

/**
 * Создать метод случайным образом выбрасывающий одно из 3-х видов
 * исключений.
 * Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */
public class Task6 {
    public static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException(),
            1, new ArrayIndexOutOfBoundsException(),
            2, new NullPointerException()
    );

    public static void main(String[] args) {
        Random r = new Random();
        try {
            unsafe(r.nextInt(5));
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("1");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("2");
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("3");
            e.printStackTrace();
        }

    }

    public static void unsafe(int numberException) throws Throwable {
        throw EXCEPTIONS.getOrDefault(numberException, new MyException("hello, this my exception"));
    }
}
