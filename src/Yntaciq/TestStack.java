package Yntaciq;
//class  Stack
//{
//    int stack [] = new int[10];
//    int tos ;
//    Stack(){
//        tos= -1;
//    }
//    void push(int item){
//        if (tos == 9)
//            System.out.println("Stack lcvel e");
//        else
//            stack[++tos] = item;
//    }
//    int pop(){
//        if (tos < 0){
//            System.out.println("Steak datark e ");
//            return  0;
//        }
//        else
//            return  stack[tos--];
//    }
//}
public class TestStack {
    public static void main(String[] args) {
//        Stack mystack1 = new Stack();
//        Stack mystack2 = new Stack();
//        for (int i = 0; i <10 ; i++)
//            mystack1.push(i);
//        for (int i =10; i <20 ; i++)
//            mystack2.push(i);
//
//        System.out.println("Steck v mystac1: ");
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(mystack1.pop());
//        }
//        System.out.println("Steck v mystack2: ");
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(mystack2.pop());
//        }


        int qanak = 10;
        int gin = 100;
        double zexch = 0.75;
        double cost;
        cost = (qanak > 10) ? qanak * gin * zexch : qanak * gin;
        System.out.println(cost);
        }

        }
