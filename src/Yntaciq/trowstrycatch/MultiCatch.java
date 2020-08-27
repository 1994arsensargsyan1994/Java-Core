package Yntaciq.trowstrycatch;

public class MultiCatch {
    public static void main(String[] args) {
        int a =88,b = 0;
        int result;
        char [] ch = {'A','B','C'};
        for (int i = 0; i <2 ; i++) {
            try {
                if (i == 0) {
                    result = a / b;
                } else {
                    ch[5] = 'D';
                }
            }catch (final  ArithmeticException | ArrayIndexOutOfBoundsException exc){
                System.out.println("Пepexвaчeннoe исключение: "+ exc);
            }

        }
        System.out.println("Пocлe группового перехватчика исключений");
    }
}
