package lesson.les6;

public class Singleton {
    private static Singleton instans;     // = new Singlton()  igr
     private Singleton(){
        System.out.println(" Singleton constructor called ");
    }
    public  static Singleton getInstance(){
        if (instans == null) {                  // leyzi
            instans = new Singleton();
        }
        return instans;
    }
    public  static  void test(){

         System.out.println(" test method called");
    }
}
