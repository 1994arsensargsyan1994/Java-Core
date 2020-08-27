package auditorium.lesson10;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("Zero"); //0
        list.add("One"); // 1
        list.add("Two"); // 2
        list.add("Four"); // 3

        list.add(3, "Three");
        list.add(0, "---------");

        list.add("Five");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
//
//        System.out.println();
//        list.add(2, "Vaspur");
//        list.add(3, "Vaspurik");
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));
//
//        list.add(0, "Vaspurich");
//        System.out.println();
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));
//        System.out.println(list.get(6));
//        System.out.println();
//        list.add(6, "gazanik");
//        //list.add("korac arjeq");
//        System.out.println();
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));
//        System.out.println(list.get(6));
//        System.out.println(list.get(7));
//       // System.out.println(list.get(8));



    }

}
