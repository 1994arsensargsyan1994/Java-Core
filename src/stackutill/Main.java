package stackutill;

public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        for (int i = 1; i <20 ; i++) {
            stack1.push(i);
        }
        for (int i = 0; i <25 ; i++) {
            System.out.println(stack1.pop());

        }

    }
}
