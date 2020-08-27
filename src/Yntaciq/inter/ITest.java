package Yntaciq.inter;

public interface ITest {           // obichni inretface
     int PUO = 10;                       // pumalchyanu    public static  final int POU = 10;
     void method();                     // pumalchyanu    public abstract method();

    static int sum (){
        return  10 + 10;            // java 8 ic inerteface tuylatvum e metodner realziacnel static -ov
    }
    default  int mul(){             // java 8 ic inerteface tuylatvum e metodner realziacnel default -ov
        return  10 * 10;
    }

}
interface I1{
    void method(); // fukcyanalni interface interface voy uni yndameny mek dasht mek absratk method
}
interface I2{}          // interface marka aranc marmni