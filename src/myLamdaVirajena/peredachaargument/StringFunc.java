package myLamdaVirajena.peredachaargument;

public interface StringFunc {
    String func(String str);
}
class LambdaAsArgument{
    static String stringOp(StringFunc sf,String str){
        return sf.func(str);
    }

    public static void main(String[] args) {
      String inStr= "Лямбда - выражен и я п о в ыш а ю т э ф ф е к т и в н о с т ь J a v a " ;
      String outStr="";
      outStr = stringOp((str) ->str.toUpperCase(),inStr);
        System.out.println(outStr);
        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;

        },inStr);
        System.out.println(outStr);
        System.out.println();
        StringFunc revers= (str)->{
            String result="";
            for (int i = str.length()-1; i >=0 ; i--) {
                result += str.charAt(i);
            }
                return  result;
        };
        System.out.println(stringOp(revers,inStr));
    }
}