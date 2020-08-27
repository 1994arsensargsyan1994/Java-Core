package stackutill;

public class StackFullException extends  Exception {
    int size;
    public StackFullException(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "StackFullException{" +
                "Стек заполнен. Максимальный размер стека: " + size +
                '}';
    }
}
