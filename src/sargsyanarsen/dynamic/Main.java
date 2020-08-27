package sargsyanarsen.dynamic;

import animal.Lion;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        Lion lion = new Lion();
        dynamicArray.add(5);
        dynamicArray.add("Arsen");
        dynamicArray.add(true);
        dynamicArray.add('%');
        dynamicArray.add(lion);
             System.out.println(dynamicArray.get(-17));
//
//        for (int i = 0; i <dynamicArray.size() ; i++) {
//            System.out.println(dynamicArray.get(i));
//        }
//        dynamicArray.remove(lion);
//        for (int i = 0; i <dynamicArray.size() ; i++) {
//            System.out.println(dynamicArray.get(i));
//        }

    }

}
