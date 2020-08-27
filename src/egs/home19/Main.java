package egs.home19;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
      TreeMap a = new TreeMap();
//        a.remove();
     //   a.get();
//        a.put();
        BinarySearchTree binarySearchTree = new BinarySearchTree();

      //  binarySearchTree.put("A",589);


        System.out.println(binarySearchTree.put(8,"c"));
        System.out.println(binarySearchTree.put(5,"b"));
        System.out.println(binarySearchTree.put(1,"o"));
        System.out.println(binarySearchTree.put(9,"op"));
        System.out.println(binarySearchTree.put(15,"l"));
        System.out.println(binarySearchTree.put(7,"a"));




        System.out.println();
        System.out.println(binarySearchTree.getSize());
//      System.out.println();
//      System.out.println(binarySearchTree.get(8));
//      System.out.println(binarySearchTree.get(5));
//      System.out.println(binarySearchTree.get(1));
//      System.out.println(binarySearchTree.get(9));
//      System.out.println(binarySearchTree.get(15));
//      System.out.println(binarySearchTree.get(7));
//      System.out.println(binarySearchTree.get(71));
      System.out.println("_________________");
     binarySearchTree.printTraversal();


      System.out.println(binarySearchTree.getSize());

    }
}
