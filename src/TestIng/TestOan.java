package TestIng;

public class TestOan {
    public  static  void aMethod() throws  Exception{
        try {
            throw new Exception();
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        try {
            aMethod();
        }catch (Exception ex){
            System.out.println("exception");
        }
        System.out.println("finished");
    }
}
