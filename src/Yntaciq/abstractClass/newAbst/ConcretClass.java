package Yntaciq.abstractClass.newAbst;

public class ConcretClass extends AbstractClass {
    String s = "First";
    ConcretClass(){
        System.out.println("3 ConretClass");
        s = "second";
    }

    @Override
    public  void  abstractmethod(){
        System.out.println("realizaion abstractmetod in conktretclass "+s);
    }
}
