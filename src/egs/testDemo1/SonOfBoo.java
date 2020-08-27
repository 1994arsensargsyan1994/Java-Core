package egs.testDemo1;

public class SonOfBoo extends Boo {

    public SonOfBoo() {
        super("boo");
    }

    public SonOfBoo(int i) {
        super("Fred");
    }

    public SonOfBoo(String s) {
        super(42);
    }

   //public SonOfBoo(int i, String s) {  // dos not cample
//
  // }

//    public SonOfBoo(String a, String b, String c) {  dos not cample
//        super(a, b);
//    }

    public SonOfBoo(int i, int j) {
        super("man", j);
    }

//    public SonOfBoo(int i, int x, int y) {
//        super(i, "star");
//    }
}

