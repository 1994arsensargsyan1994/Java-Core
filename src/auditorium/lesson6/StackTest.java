package auditorium.lesson6;

public class StackTest {

    public static void main(String[] args) {

        Stack stack = new Stack(10);

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.pop());

    }

}
