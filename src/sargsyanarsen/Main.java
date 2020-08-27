package sargsyanarsen;

public class Main {
    public static void main(String[] args) {
        DynamicArray obj = new DynamicArray(10);
        for (int i = 0; i <11 ; i++) {
            obj.add(i);
        }
        obj.add(8);
        System.out.println(" It is my array without changes");
        obj.print();
        System.out.println("_________________________________________");
        System.out.println(" it is contains method with parameter (value = 9)");
        System.out.println(obj.contains(9));
        System.out.println("_________________________________________");
        System.out.println(" It is set (0,27) method ");
        obj.set(0,27);
        obj.print();
        System.out.println("_________________________________________");
        System.out.println(" It is add method with parameter (0,0)");
        obj.add(7,55);
        obj.print();
        System.out.println("_________________________________________");
        System.out.println(" It is remove (index = 5) method ");
        obj.remove(5);
        obj.print();
        System.out.println("_________________________________________");
        System.out.print(" if(!object.isEmpty) output size() : ");
        if (!obj.isEmpty()){
            System.out.println(obj.size());
        }
        System.out.println( obj.get(10));
        System.out.println(obj.size());

        for (int i = 0; i <6 ; i++) {
            obj.remove(i);
        }
        obj.print();
    }
}
