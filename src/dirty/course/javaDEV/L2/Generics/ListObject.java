package dirty.course.javaDEV.L2.Generics;

import java.util.Iterator;

public class ListObject<T> implements Iterable<T> {
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

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{

        private int counterSize;

        @Override
        public boolean hasNext() {
            return counterSize < size;
        }

        @Override
        public T next() {
            return objects[counterSize++];
        }
    }
}
