package auditorium.lesson2;

public class LoopExample {

    public static void main(String[] args) {


        // a++ <=> a = a + 1

        int a = 1;
        int b = a;

        int value = 20;

//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++b);
//        System.out.println(b);

        for (int i = 1; i <= value; i++) {
            if (i >= 15) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }

    }

}
