package Yntaciq.lesoons7;

public class Stack {
    private  static  final int  DEFAULT_CAPACITY = 16;
    private Object[] storage;
    private  int tos;

    public Stack() {

        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {

        init(capacity);
    }
    private void init(int capacity ){
        this.storage = new Object[capacity];
        this.tos = -1;
    }
    public void push(Object value) {
        if (tos ==storage.length-1){
        }
        storage[++tos] = value;

    }

    public Object pop() {
        return tos < 0 ?null: storage[tos--];
    }
    public boolean isEmpty(){
        return tos < 0;
    }
    public void  clear(){
        init(DEFAULT_CAPACITY);
    }


}
