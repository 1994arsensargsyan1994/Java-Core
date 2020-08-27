package myLamdaVirajena.MyLamdaExseption;

public class LambdaExceptionDemo {
    public static void main(String[] args)  throws  EmptyArrayException{
        double [] values = {1.0,0.8,1.2,1.11};
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            if (n.length==0){
                throw  new EmptyArrayException();
            }
            for (int i = 0; i <n.length ; i++) {
                sum +=n[i];
            }
            return sum / n.length;
        };
        System.out.println(average.func(values));
        System.out.println(average.func(new double[0]));
    }
}
