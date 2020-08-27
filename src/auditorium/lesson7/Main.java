package auditorium.lesson7;

import auditorium.User;

public class Main {

    public static void main(String[] args) {

        Stack<? super User> gen = new Stack<>();

//        gen.push("sadsd");

        gen.push(new User());
//        gen.push(new TT());

        Stack objStack = new Stack();

        Stack<User> userStack = new Stack<>();

//        userStack.push("asdasdasd");

        Stack<String> stringStack = new Stack<>();
        stringStack.push("asdasd");
        String lastString = stringStack.pop();

//
//
//        Stack stack = new Stack();
//        Object o = new Integer(5);
//        Object o1 = "adasdasdas";
//        Object o2 = new User("Vardan", "Urumyan");
//        stack.push(o);
//        stack.push(o1);
//        stack.push(o2);
//
//        User user = (User) stack.pop();
//        System.out.println(user.getName());
//
//        Object str = stack.pop();
//        String ss = (String) str;
//        System.out.println(ss.split(" "));
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        stack.clear();
//
//        for (int i = 1; i <= 10; i++) {
//            stack.push(new User("Vardanik_" + i, "Urumyanik_" + i));
//        }
//
//        for (int i = 0; i < 10; i++) {
//            Object item = stack.pop();
//            User u = (User) item;
//            System.out.println(u.getName());
//        }
//
//
//        Object v1 = new User("Vardan", "Urumyan");
//        Object v2 = new User("Vardan", "Urumyan");
//
//        System.out.println("Must be cool!!!");
//
//        System.out.println(v1 == v2);
//        System.out.println(v1.equals(v2));

        Stack<User> userStack1 = new Stack<>();
        userStack1.push(new User());

        m1(userStack1);

        User u = userStack1.pop();

    }

    private static void m1(Stack stack) {
        stack.push(new User());
        stack.push(new String("asdasd"));

    }



}

class TT extends User {

}

