package auditorium.lesson6;

public class Stack {

    public static final int DEFAULT_CAPACITY = 16;

    private int[] storage;
    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        // TODO validate capacity value
        this.storage = new int[capacity];
        this.tos = -1;
    }

    public void push(int val) {
        // TODO check if stack is full than extend it please!
        this.storage[++tos] = val;
    }

    public int pop() {
        if (tos < 0) {
//            System.err.println("Stack is empty.");
            System.out.println("Stack is empty.");
            return -1;
        }
        return this.storage[tos--];
    }

}
