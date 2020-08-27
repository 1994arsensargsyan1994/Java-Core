package auditorium.lesson1;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // i = 1
            for (int j = 4; j > i; j--) { // i = 1; j = 4
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) { // i = 1 j == 0
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
