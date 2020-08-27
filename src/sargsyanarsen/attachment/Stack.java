package sargsyanarsen.attachment;


public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    private char[] storage;

    private int tos;

    public Stack() {

        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        this.storage = new char[capacity];
        this.tos = -1;
    }

    public void push(char value) {
        if (tos ==storage.length-1){
            growSize();
        }
        storage[++tos] = value;
        // if tos == storage.length -1 then must be called a method for instance "extendStorage()"
        // in the mentioned method You must create new int[] fill in content of storage field,
        // and then assign the new array reference to the storage field.
    }

    public char pop() {
        char emptychar = '\000';
        return tos < 0 ? emptychar : storage[tos--];
    }

    public boolean isEmpty(){
        return tos < 0;
    }
    private   void growSize(){
        char[] temp = new char[storage.length + (storage.length / 2)+1];
        System.arraycopy(storage, 0, temp, 0, storage.length);
        storage = temp;
    }
    public void  clear(){
        tos = 0;
    }
}
