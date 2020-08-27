package auditorium.lesson10;

import java.security.InvalidParameterException;

public class ArrayList<E> implements List<E> {

    private int size;
    private Object[] storage;

    public ArrayList() {
        this.storage = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(E element) {

    }

    @Override
    public void add(int index, E element) {

    }

    @SuppressWarnings("unchecked")
    @Override
    public E set(int index, E element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index could not be more then size.\n"
                    + "Index: " + index + ", Size: " + size);
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index could not be negative. Index:" + index);
        }
        E oldElement = (E) storage[index];
        storage[index] = element;
        return oldElement;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void remove(E element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
