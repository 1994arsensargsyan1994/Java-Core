package classEnum;

public class TestMusic {
    public static void main(String[] args) {
        Music mc = Music.CLASIC;
        System.out.println(mc.getI());
        System.out.println(mc.getNamee());
        Music mc1 = Music.valueOf("POP");
        System.out.println(mc1.getI());
        System.out.println(mc1.getNamee());
        System.out.println("____________________________");
        mc.foo();
        mc.ordinal();


    }

}
