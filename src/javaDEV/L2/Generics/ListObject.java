package javaDEV.L2.Generics;

public class ListObject<T> {
    private final T[] objects;
    private int size;

    public ListObject(int initialSize){
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T obj){
        objects[size++] = obj;
    }

    public Object get(int index){
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
