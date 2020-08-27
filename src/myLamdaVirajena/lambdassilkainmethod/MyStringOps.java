package myLamdaVirajena.lambdassilkainmethod;

public class MyStringOps {
    static String strRevers(String str) {
        int i;
        String result = "";
        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {
    static  String stringOP(StringFunc fs,String in){
        return fs.func(in);
    }

    public static void main(String[] args) {
        String inStr= "Lambda improve effect Java ";
        String outStr="";
        outStr = stringOP(MyStringOps::strRevers,inStr);
        System.out.println(outStr);
    }

}