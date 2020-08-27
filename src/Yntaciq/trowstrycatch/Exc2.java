package Yntaciq.trowstrycatch;

public class Exc2 {
    public static void main(String[] args) {
//        int a,d;
//        try {
//            d = 0;
//            a = 42 / d;
//            System.out.println("Ays toxy chi tpvi");
//        }catch (ArithmeticException e){
//            System.out.println("Delenaa na nol");
//        }
//        System.out.println("chathic heto ");
//        try {
//            System.out.println("mijev operator throw");
//            throw  new ArithmeticException();
//        }catch (ArithmeticException e){
//            System.out.println("Isklucena ");
//        }
//        System.out.println("tru u catch operatorneric heto ");

        try {
            genException();
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Фaтaльнaя ошибка - \" +\n" +
                    "\"выполнение программы прервано!");
        }
    }

    public static void genException() {
        int[] nume = {4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] dume = {4, 2, 0, 0, 2, 4};
        int length = nume.length;
        for (int i = 0; i < length; i++) {
            try {
                System.out.println(nume[i] + "/" + dume[i] + "=" + nume[i] / dume[i]);
            } catch (ArithmeticException e) {
                System.out.println("delaena nol");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("hamapatsxan elementy chi gtnvel");
                throw e;
            }


        }
    }
}
