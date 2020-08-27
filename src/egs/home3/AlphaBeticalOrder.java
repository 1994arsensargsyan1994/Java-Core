package egs.home3;

import java.util.Scanner;

public class AlphaBeticalOrder {
    public static void main(String[] args) {
       String[] strArray = fillArray();
       strArray = order(strArray);
        print(strArray);    }

    public static String[] fillArray() {
        String[] strArray = null;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count your array :");
        count = sc.nextInt();
        if (count > 0) {
            strArray = new String[count];
        } else {
            System.out.println("Number of count is negative or equal 0 ");
            System.exit(0);
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter String name for strArray :");
        for (int i = 0; i < count; i++) {
            strArray[i] = sc2.nextLine();
        }
        sc.close();
        sc2.close();
        return strArray;
    }
    public  static  String[] order(String []strArray){
        String temp;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j <strArray.length; j++) {
                if (strArray[i].compareTo(strArray[j])> 0) {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
                }
            }
return strArray;
        }
        public  static void print(String [] strArray) {
        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(strArray[i]+ ",");

        }


    }
}
