package Yntaciq.trowstrycatch;

public class UseFinally {
   public static void  genException(int val) {
       int t;
       int[] num = new int[2];
       System.out.println("Пoлyчeнo: " + val);
       try {
           switch (val){
               case  0:
                   t = 10 / val;
                   break;
               case  1:
                   num[4] = 8;
                   break;
               case  2:
                   return;
           }

       }catch (ArithmeticException exc){
           System.out.println("Пoпыткa деления на нуль");
       return;
   }catch (ArrayIndexOutOfBoundsException exc){
           System.out.println("Cooтвeтcтвyющий элемент не найден");
           return;
       }
       finally {
           System.out.println("Bыxoд из блока try");
       }
       }

    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
   }
