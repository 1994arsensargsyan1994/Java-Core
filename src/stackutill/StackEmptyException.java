package stackutill;

public class StackEmptyException extends  Exception {
    @Override
    public String toString() {
        return "\nСтек пуст.";
    }
}
