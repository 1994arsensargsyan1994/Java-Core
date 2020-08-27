package sargsyanarsen.dynamic;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray {
    private Object[] storage;
    private int size;
    private static  final  int CAPACITY = 16;
    public DynamicArray(){

        this.storage = new Object[CAPACITY];
    }
    DynamicArray(int value) {
        if (value > 0)
            storage = new Object[value];
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public boolean contains(Object val) {
        for (int i = 0; i < size; i++) {
            if (storage[i] == val) {
                return true;
            }
        }
        return false;  
    }
    public Object get(int index) {
        try {
            return storage[index];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds");
        }
        return  -1;
    }


    // sets the specified val by the specified index
    public void set(int index, Object val) {
        if (index >= 0 || index<= size) {
            System.out.println("Error");
            return;
        }else {
            storage[index] = val;
        }
    }

    public void add(Object element) {
        if (size == storage.length){
            growSize();
        }
        storage[size++] = element;
    }


    public void add(int index, Object element) {
        if (size == storage.length){
            growSize();
        }
        for (int i =size; i >= index; i--) {
            storage[i + 1] = storage[i];
        }
        size++;
        storage[index] = element;

    }
    public void removeByIndex(int index) {
        for (int i = index; i <size-1; i++) {
            storage[i] = storage[i+1];
        }
        size--;
    }
    /**
     * Removes the first element which is equal to specified element
     * Shifts any subsequent elements to the left
     */
    public void remove(Object element) {
        for (int i = 0; i <size; i++) {
                if (storage[i].equals(element)) {
                    removeByIndex(i);
                    return;
                }
            }
        System.out.println("That element was not found");
        }
   private void growSize(){
        Object[] temp = new Object[storage.length + (storage.length / 2)];
        System.arraycopy(storage, 0, temp, 0, size);
        storage = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicArray that = (DynamicArray) o;
        return size == that.size &&
                Arrays.equals(storage, that.storage);
    }

}
