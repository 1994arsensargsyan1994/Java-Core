package lesson10;

import java.security.InvalidParameterException;

public interface List <E> {
    int sharedValue=100;
    int CAPACITY = 10;

    /**
     *
     * @param element
     */
    void add(E element);
    void add(int index,E element);
    E set(int index,E element) throws IndexOutOfBoundsException;
    E get(int index)throws IndexOutOfBoundsException;
    void removeOfElement(E element);
    void remove(int index);
    boolean isEmpty();
    int size();

}
