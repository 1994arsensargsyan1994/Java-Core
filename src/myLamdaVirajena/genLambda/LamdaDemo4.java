package myLamdaVirajena.genLambda;

public class LamdaDemo4 {
    public static void main(String[] args) {
        SumFunc<String> sim = (str)-> {
            String result="";
            int i;
            for ( i = str.length()-1; i >=0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        SumFunc<Integer> fact = (n)->{
            int result = 1;
            for (int i = 1; i <=n ; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(sim.func("Aren"));
        System.out.println(sim.func("pipic"));
        System.out.println(fact.func(3));
        System.out.println(fact.func(5));
    }
}
