package generic.ex2;

public class MyClass <T1,T2>{
public  T1 var1;
public  T2 var2;

    public MyClass(T1 var1, T2 var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
}
  class  Main{
    public static void main(String[] args) {
        MyClass<Integer,Integer> ins = new MyClass<>(1,2);
        System.out.println(ins.var1 + ins.var2);
        MyClass<String,Integer> ins1 = new MyClass<>("Heloo ",5);
        System.out.println(ins1.var1 + ins1.var2);
        MyClass<String,String> ins2 = new MyClass<>("Heloo","World");
        System.out.println(ins2.var1 + ins2.var2);
    }
}
