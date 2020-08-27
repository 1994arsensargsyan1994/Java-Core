package Yntaciq.trowstrycatch;

public class ExcTest {
    public  static  void useThrowAbleMethods(){
        int[] nums = new int[4];
        System.out.println("Дo генерации исключения");
        nums[7]= 15;

    }

    public static void main(String[] args) {
     try {
         useThrowAbleMethods();
     }catch (ArrayIndexOutOfBoundsException exc){
         System.out.println("Cтaндapтнoe сообщение:");
         System.out.println(exc);
         System.out.println("\nCтeк вызовов:");
         exc.printStackTrace();
     }
        System.out.println("Пocлe оператора catch");
    }
}
