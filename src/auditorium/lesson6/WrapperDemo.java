package auditorium.lesson6;

public class WrapperDemo {


    public static void main(String[] args) {

        Integer i = 45;
        i = Integer.valueOf(45);

        int a = i; // i.intValue()

        Character ch = 'a';

        test("asa", "as", "");



        /*
        byte >> Byte
        short >> Short
        int >> Integer
        long >> Long

        float >>
        char >> Character

         */



    }


    public static void test(String... arg) {
        String[] asd = arg;
    }
}
