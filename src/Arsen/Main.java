package Arsen;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("--------------1------------");
        System.out.println();
        for (int i = 1; i < 16; i++) {
            if (i == 1) {
                System.out.println("*");
            }
            if (i > 1) {
                System.out.printf("*");
            }
            if (i == 3) {
                System.out.println();
            }
            if (i == 6) {
                System.out.println();
            }
            if (i == 10) {
                System.out.println("");
            }
            if (i == 15) {
                System.out.println("");
            }


        }

        System.out.println("------------2--------------");
        System.out.println();

        for (int i = 1; i < 12; i++) {


            if (i <= 10) {
                System.out.printf(" ");
            }

            if (i == 4) {
                System.out.println("*");

            }
            if (i == 7) {
                System.out.println("**");
            }
            if (i == 9) {
                System.out.println("***");
            }
            if (i == 10) {
                System.out.println("****");
            }
            if (i == 11) {
                System.out.println("*****");
            }

        }
        System.out.println("--------------------------1-------------------------------");// internetic
        System.out.println();
        int row = 1;
        int last = 0;
        for (int i = 1; i < 16; i++) {
            if (i < (row + last)) {
                System.out.print("*");
            } else {
                System.out.println("*");
                row++;
                last = i;
            }
        }
        System.out.println("-----------------------3--------------------------");
        for (int i = 0; i < 16; i++) {
            if (i == 0 || i < 5)
                System.out.printf("*");
            if (i == 5) {
                System.out.println();
            }
            if (i > 4 && i < 9) {
                System.out.printf("*");

            }
            if (i == 9) {
                System.out.println();
            }
            if (i > 8 && i < 12) {
                System.out.printf("*");
            }
            if (i == 11) {
                System.out.println();

            }
            if (i > 10 && i < 13) {
                System.out.printf("*");

            }
            if (i == 13) {
                System.out.println();
                System.out.println("*");
            }


        }


        System.out.println("------------------1------------------");// 2 forov

        for (int i = 0; i < 5; i++) {
            for (int j = -1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println();
        System.out.println();
        System.out.println("----------------3----------------------");//2 forov

        int f = 5;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < f; j++) {
                System.out.printf("*");


            }
            System.out.println("");
            if (i == 1) {
                f = 4;
            }
            if (i == 2) {
                f = 3;
            }
            if (i == 3) {
                f = 2;
            }
            if (i == 4) {
                f = 1;
            }


        }
        System.out.println();
        System.out.println("-----------------4---------------------");
        int count = 0;
        int k = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf(" ");



            }
            k = 0;
            if (i < 15) {
                System.out.print("*");
            }


            count++;
            if (count == 5) {
                System.out.println();
                k = 1;

            }
            if (count == 9){
                System.out.println();
                k = 2;

            }
            if (count == 12){
                System.out.println();
                k = 3;

            }
            if (count == 14){
                System.out.println();
                k = 4;


            }




        }
        System.out.println();
        System.out.println("------------------5--------------------");
        int tmp = 3;
        int count1 = 0;
        for (int i = 0; i < 25 ; i++) {
            for (int j = 0; j < tmp; j++) {
                System.out.printf(" ");

            }
            tmp = 0;
            if (i < 25)
            {
                System.out.printf("*");
            }
            count1 ++;
            if (count1 == 1)
            {
                System.out.println();
               tmp = 2;
            }
            if (count1 == 4)
            {
                System.out.println();
                tmp = 1;
            }
            if (count1 == 9)
            {
                System.out.println();
                tmp = 0;
            }
            if (count1 == 16)
            {
                System.out.println();
                tmp = 1;
            }
            if (count1 == 21)
            {
                System.out.println();
                tmp = 2;
            }
            if (count1 == 24)
            {
                System.out.println();
                tmp = 3;
            }
            if (count1 == 25)
            {
                System.out.println();
                tmp = 0;
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("_________________________________________________________________");
        int a = 0;
        for (int i = 1; i < 100; i+=i) {
            System.out.println("2 i  "+a+":astchan "+ i );
            a++;
        }


    }
}









