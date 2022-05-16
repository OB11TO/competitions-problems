package Course.javaDEV.L2.Generics.HW;


/**
 * Создать класс Pair, параметризованный двумя
 * параметрами K и V. Класс должен хранить две
 * переменные типов K и V соответственно. У
 * класса должен быть конструктор,
 * принимающий 2 параметра типов K и V, а
 * также набор соответствующих
 * геттеров/сеттеров, toString (для отображения состояния текущего объекта типа Pair)
 *
 * Создать статический обобщённый метод swap
 * в утилитом классе PairUtil (утилитный класс – это класс только со статическими методами,
 * который имеет private конструктор и помечен ключевым словом final,
 * чтобы предотвратить создание объектов этого класса, а также наследоваться от него).
 * Метод должен принимать объект класса Pair и возвращать
 * новый объект Pair, в которой элементы поменяны местами.
 */

public class D1 {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("111a", 222);
        System.out.println(pair);

        Pair<String, Integer> pairReverse = new Pair<>("111a", 222);
        System.out.println(PairUtil.swap(pairReverse));
    }

}


class Pair<K,V>{
   private K key;
   private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" + "key=" + key +
                ", value=" + value +
                '}';
    }
}

final class PairUtil{

    private PairUtil() {
    }

    public static <K,V> Pair<V,K> swap(Pair<K,V> pair){
        V second = pair.getValue();
        K first = pair.getKey();
        return new Pair<>(second,first);

    }
}
