package gen.genproject;

public class QueueFullException1 extends Exception {
    int size;

    public QueueFullException1(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " +
                size;
    }
}
