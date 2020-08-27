package Yntaciq;

import java.util.ArrayList;
import java.util.List;

public class Te {

//        private static final ArrayList<String> values = new ArrayList<>();
//        public static void main(String[] args) {
//            values.add("changed");
//            ArrayList<String> a = new ArrayList<>() ;
//        //    values = a; // it is finel
//    }
private String color;

    private int height;

    private int length;

    public Te(int length, int theHeight) {

        length = this.length;
// backwards – no good!

        height = theHeight;
// fine because a different name

        this.color = "white";
    }
// fine, but redundant

        public static void main (String[]args){
//            Te b = new Te(1, 2);
//            System.out.println(b.length + " " + b.height + " " + b.color);
            List<String> bunnies = new ArrayList<>();
            bunnies.add("long ear");
            bunnies.add("floppy");
            bunnies.add("hoppy");
            System.out.println(bunnies);// [long ear, floppy, hoppy]
            bunnies.removeIf(s -> s.charAt(0) != 'h');
            System.out.println(bunnies);// [hoppy]
        }

    }
