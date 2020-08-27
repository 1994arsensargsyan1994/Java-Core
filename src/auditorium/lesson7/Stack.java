package auditorium.lesson7;

import auditorium.User;

//public class Stack <T extends User> {
public class Stack <T> {

    private static final int DEFAULT_CAPACITY = 16;
    private Object[] storage;
    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        init(capacity);
    }

    private void init(int capacity) {
        this.storage = new Object[capacity];
        this.tos = -1;
    }

    public void push(T o) {
        this.storage[++tos] = o;
    }

    public T pop() {
        return tos < 0 ? null : (T) storage[tos--];
    }

    public void clear() {
        init(DEFAULT_CAPACITY);
    }

    public Object peek() {
        return tos < 0 ? null : storage[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

}
