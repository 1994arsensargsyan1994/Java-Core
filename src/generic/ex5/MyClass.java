package generic.ex5;

public class MyClass<T> {
    public  T add(T a , T b){
        if (a.getClass().equals(Integer.class)){
            return (T) (Object) ((Integer) a + (Integer )b);
        }
        if (a.getClass().equals(Double.class)){
            return (T) (Object) ((Double) a + (Double ) b);
        }
        return  (T) (Object) 0;
    }
}

class Main{
    public static void main(String[] args) {
        MyClass<Double> my = new MyClass<>();
        double sum = my.add(1.5,4.8);

        System.out.println(sum);
    }
}