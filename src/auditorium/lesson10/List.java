
package auditorium.lesson10;

import java.security.InvalidParameterException;

public interface List<E> {

    int DEFAULT_CAPACITY = 10;

    /**
     * Add element into list
     *
     * @param element should be added
     */
    void add(E element);

    /**
     * Add element into list at specified index
     *
     * @param index the element
     * @param element should be added
     */
    void add(int index, E element);

    /**
     * Replace element at specified index
     *
     * @param index   which should be replaced
     * @param element new value that should be stored
     * @return removed element
     * @throws IndexOutOfBoundsException when index more than element size
     */
    E set(int index, E element) throws IndexOutOfBoundsException;

    E get(int index) throws IndexOutOfBoundsException;

    void remove(E element);

    void remove(int index);

    int size();

    boolean isEmpty();

}
