package gen.genInertface;

public class GenInDemo {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3};
        MyClass<Integer> obj = new MyClass<>(x);
        if (obj.contains(2)) {
            System.out.println("obj fill in 2");
        } else {
            System.out.println("obj can not fill 2");
        }
        if (obj.contains(5)) {
            System.out.println("obj fill in 5");
        } else {
            System.out.println("obj can not fill 5");
        }
//        if (obj.contains(9.25)) {     // masivy obj i mej Integera isk trvac tivy dabl
//
//        }
    }
}
