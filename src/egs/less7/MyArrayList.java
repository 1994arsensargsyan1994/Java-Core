package egs.less7;

public class MyArrayList {
    private Integer[] storage;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        storage = new Integer[capacity];
        size = 0;
    }

    void growSize() {
        Integer[] temp = new Integer[storage.length * (storage.length / 3) + 1];
        System.arraycopy(storage, 0, temp, 0, size);
        storage = temp;
    }

    public void add(Integer element) {
        if (size == storage.length) {
            growSize();
        }
        storage[size++] = element;
    }

    public void add(Integer element, int index) {
        if (size == storage.length) {
            growSize();
        }
        for (int i = size; i >= index; i--) {
            storage[i -1] = storage[i]; // also storage[i +1] = storage[i];
        }
        size++;
        storage[index] = element;
    }

    public void set(int index, Integer element) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("index mast be > 0 And < size ");
        }
        storage[index] = element;
    }

    public boolean contains(Integer element) {
        for (int i = 0; i < size; i++) {
            if (storage[i].equals(element)) {
                return true;
            }
        }
        return false;

    }

    public Integer remove(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("index mast be > 0 And < size ");
        }
        for (int i = index; i < size -1; i++) {
            storage[i] = storage[i + 1];
        }
        size--;
        return storage[index];
    }

    public Integer removeByElement(Integer element) {
        for (int i = 0; i < size; i++) {
            if (storage[i].equals(element)) {
                return remove(i);
            }
        }
        return null;
    }

    public Integer get(int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("index mast be > 0 And < size ");
        }
        return storage[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Integer[] clear() {
        return storage = new Integer[storage.length];
    }



}
