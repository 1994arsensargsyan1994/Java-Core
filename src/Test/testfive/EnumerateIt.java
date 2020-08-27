package Test.testfive;

public class EnumerateIt {
    public static void main(String[] args) {
        for (A a :A.values()) {
            System.out.print(a.name() + ""+ a.ordinal()+"");
            try {
                B b = B.valueOf(a.name());
                System.out.print(b.name()+""+b.ordinal()+"");
            }catch (Exception e){
                System.out.print(a.name()+""+a.ordinal()+"");
            }
        }
    }
}
