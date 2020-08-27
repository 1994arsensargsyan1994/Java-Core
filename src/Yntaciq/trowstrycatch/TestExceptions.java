package Yntaciq.trowstrycatch;

public class TestExceptions {
    public static void main(String[] args) {
        String test = "non";
        try {
            System.out.println("Nacalo try");
            doRisky(test);
            System.out.println("kanca try");
        }catch ( ScaryExcepiton se){
            System.out.println("Jutki iskluchenia");
        }finally {
            {
                System.out.println("finally");
            }
            System.out.println("kanec main");
        }
    }
    static void doRisky(String test) throws  ScaryExcepiton{
        System.out.println("nachalo opasnvo metoda");
        if ("non".equals(test)){
            throw new ScaryExcepiton();
        }
        System.out.println("kanac apasnvo metod");
        return;
    }
}
