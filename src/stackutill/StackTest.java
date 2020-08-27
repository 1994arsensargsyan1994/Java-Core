package stackutill;

public class StackTest {
    public static void main(String[] args) {
        NewStack stack = new NewStack(2);
        for (int i = 0; i < 3; i++) {
            try {
                stack.push(i);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException exc) {
                System.out.println(exc);
            }
        }
    }
}
