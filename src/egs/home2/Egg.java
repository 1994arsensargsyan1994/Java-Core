package egs.home2;

public class Egg {
    public Egg(){
        num = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.num);
    }
    private int num =3;
    {
        num = 4;
    }
}

