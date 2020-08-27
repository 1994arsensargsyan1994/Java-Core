package myLamdaVirajena.lanbdassilkagenmehod;

public class GenericMethodRefDemo {
    static <T> int mtOp(MyFunc <T> tMyFunc,T[]vals,T v){
        return tMyFunc.func(vals,v);
    }

    public static void main(String[] args) {
        Integer[] val ={1,5,2,8,2,5,2};
        String[] valStr = {"oan","tow","for","tow"};
        int cunt;
        cunt = mtOp(MyArrayOps::countMatching,val,2);
        System.out.println("val [] the are "+cunt+" number 2");
        cunt = mtOp(MyArrayOps::countMatching,valStr,"tow");
        System.out.println("valStr the are "+cunt+" tow ");
    }
}
