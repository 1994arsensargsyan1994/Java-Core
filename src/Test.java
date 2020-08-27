import chessBoard.neww.Board;

import java.util.ArrayList;

public class Test {
//    final  int x=1;
    void  method(){};
    public static void main(String[] args) {
        int index = 1;
        int _abcd;
        boolean a = false;
        if (a = true){
            System.out.println("true");
        }else
            System.out.println("fals");
        System.exit(0);
        Boolean[] b = new Boolean[3];
        Boolean data = b[index];
        System.out.println(data);
        for (Boolean aBoolean : b) {
            System.out.println(aBoolean);
        }
        if (2 ==3){
            System.out.println();
        }

//       Class c1 = new ArrayList<String>().getClass();
//       Class c2 = new ArrayList<Integer>().getClass();
//        System.out.println(c1 == c2);
//        int p = 0;
//        int y = 10;
//        do {
//            y--;
//            ++p;
//        }while (p < 5);
//        System.out.println(p + ","+ y);
        try
        {
            badMethod();
            System.out.print("A");
        }
        catch (Exception ex)
        {
            System.out.print("B");
        }
        finally
        {
            System.out.print("C");
        }
        System.out.print("D");

    }
    public static void badMethod()
    {
        throw new Error(); /* Line 22 */
    }
}
class A extends Test{
    void method(){
        int a = 5;

     }
    void method(int i){}
   class  Lik  extends  G{

    }
}
interface  B{}
interface C{}