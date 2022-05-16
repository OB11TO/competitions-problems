package Course.javaDEV.L2.Exeption;

/**
 * Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class Task1 {
    public static void main(String[] args) {
        String string = null;
        try {
            string.length();
        }catch(NullPointerException exception){
            exception.printStackTrace();
        }
    }
}
