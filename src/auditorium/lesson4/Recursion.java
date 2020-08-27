package auditorium.lesson4;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }


}
