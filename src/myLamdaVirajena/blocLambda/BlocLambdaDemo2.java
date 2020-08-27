package myLamdaVirajena.blocLambda;

public class BlocLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc revers= (str)->{
            String result="";
            for (int i = str.length()-1; i >=0 ; i--) {
                  result += str.charAt(i);
            }
            if (str.equals(result))
            return  result;
            else
                return "str not palirodrom";
        };
        System.out.println(revers.func("Aren"));
        System.out.println(revers.func("pipic"));
        System.out.println(revers.func("ama"));
    }
}
