package lesson10;

public class Main {


    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("zero");
        list.add("oan");
        list.add("tow");
        list.add("fore");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
            list.removeOfElement("zero");
        System.out.println("____________________________");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        }
    }
