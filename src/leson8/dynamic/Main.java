package leson8.dynamic;

import Yntaciq.lesoons7.User;

public class Main {
    public static void main(String[] args) {
        Stack<User> stack = new Stack<>();
        Stack stack2 = new Stack();
       Stack<String> stack1 = new Stack<>();
       stack1.push("arsen");
       String last = stack1.pop();
        System.out.println(last);
    }
}
