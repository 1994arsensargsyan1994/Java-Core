package myLamdaVirajena.blocLambda;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial=(n)->{
            int result = 1;
            for (int i = 1; i <=n ; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("fact 5 =: "+factorial.func(5));
        System.out.println("fact 3 =: "+factorial.func(3));
    }

}
