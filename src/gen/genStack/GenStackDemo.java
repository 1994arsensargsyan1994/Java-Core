package gen.genStack;

import stackutill.StackEmptyException;
import stackutill.StackFullException;

public class GenStackDemo {
    public static void main(String[] args) {
        Integer[] isStore = new Integer[10];
        GenStack<Integer> stack1 = new GenStack<>(isStore);
        String[] name = {"Oan", "Tow", "Three"};
        String[] strStore = new String[3];
        GenStack<String> stack2 = new GenStack<>(strStore, name);
        String str;
        int n;
        try {
            for (int i = 0; i < 10; i++) {
                stack1.push(i);
            }
        } catch (StackFullException ex) {
            System.out.println(ex);
        }
        String strStore2[] = new String[3];
        GenStack<String> stack3=
                new GenStack<String>(strStore2, stack2);
        try {
            System.out.print("Coдepжимoe stk1: ");
            for (int i = 0; i < 10; i++) {
                n = stack1.pop();
                System.out.print(n + " ");
            }
            System.out.println();
            System.out.print("Coдepжимoe stk2: ");
            for (int i = 0; i < 3; i++) {
                str = stack2.pop();
                System.out.print(str + " ");
            }
            System.out.println();
            System.out.print("Coдepжимoe stkЗ: ");
            for (int i = 0; i < 3; i++) {
                str = stack3.pop();
                System.out.print(str + " ");
            }
        } catch (StackEmptyException ex) {
            System.out.println(ex);
        }
        System.out.println();
    }
}
