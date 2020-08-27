package Yntaciq;

import java.util.Scanner;

public class CoffeMshin {
   public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Kofei hamar sexmeq <<1-poqr>>,<<2-mijin>>,<<3-mec>> i hamar");
        String  chashka = sca.next();
        int cast = 0;
        switch (chashka)
        {
            case "3":
                cast += 50;
            case "2":
                cast += 25;
            case "1":
                cast += 25;
                break;
            default:
                System.out.println("Duq katarel eq sxal yntrutyun sexmeq 1 - Poqr,2-Mijin ,3- mec bajaki hmar");

        }
        if (cast !=0)
        {
            System.out.println("Duq surchi hamar petq e vchreq "+ cast+"  dram Gumar");
        }
        else
            System.out.println("Sxal hraman porceq Noric");
//        int a = 1,x = 3,b = 5;
//        if (a > x  ) {
//            if (x < b) {
//                System.out.println(x + " y Gtnvum e " + a + " -ic mijev " + b + " diapazonum");
//            }
//        }
//        else
//            System.out.println("sxal");
    }
}
