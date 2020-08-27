package inerAndNestClass;

public class MyClass {
    private static int field = 0;
    class  inner{
      //  static int a;                               // kanpilacia sxal
        public void  method(int a){                 // ete nersi classy static(nested) che nra methodnery chi karox linel
            field = a;                              // static inch pes nayev chi karox unenal staic dasht  or. static int a;
            System.out.println("Method inner class"+ field);
        }
    }
}
class  Main{
    public static void main(String[] args) {
        MyClass.inner instans = new MyClass().new inner();
        instans.method(1);
    }
}
