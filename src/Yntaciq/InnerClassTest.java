package Yntaciq;
class  Outer{
 int outer_x  = 100;
    void test() {
        Inner iner = new Inner();
        iner.display();
    }
    class  Inner{
        void  display(){
            System.out.println("display metodum oute_x = "+ outer_x);
        }
    }

}
public class InnerClassTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.test();
        for (int i = 0; i <args.length ; i++) {
            System.out.println("args ["+ i +" ] :"+args[i]);

        }

    }
}
