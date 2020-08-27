package inerAndNestClass;

public class StantikInnerNestedClass {
    public  static class  Nested{                            // ete nersi classy statik e ( nested) na karoxe unenal inchpes
        public static void staticMethodFromNested(){         // static method aynpesel voch statik metod ev static dashter bac  hakaraky chi karox linel
            System.out.println("static method nested class");// erb nersi classy static che na chi karox unenal static method ev static dashter
        }
         int b = 89;                                    // voch static dasht
        public  void method(){
            System.out.println("non static method" + "and static fild"+b);
        }
    }
}
class Test{
    public static void main(String[] args) {
        StantikInnerNestedClass.Nested.staticMethodFromNested();

    }
}
