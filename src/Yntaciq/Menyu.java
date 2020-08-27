package Yntaciq;

import java.util.Scanner;

public class Menyu {
    public static void main(String[] args)
        //Scanner sc = new Scanner(System.in);
        throws java.io.IOException{
        char choise;

            do {

                System.out.println(" Cank ");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. while");
                System.out.println(" 4. do while");
                System.out.println(" 5. for");
                System.out.println(" Yntrir inchvormeky");
                choise = (char) System.in.read();
            }

                while (choise < '1' || choise > '5') ;
            System.out.println("\n");

            switch (choise){
                case '1':
                    System.out.println(" Paymankan operatr if \n");
                    System.out.println(" if(payman) {");
                    System.out.println("If i marmin }");
                    break;

                case '2':
                    System.out.println("  orerator Switch  \n");
                    System.out.println("switch(arjeq)  {");
                    System.out.println("case : }");
                    break;
                case '3':
                    System.out.println(" Paymankan cikl while \n");
                    System.out.println(" while(payman) {");
                    System.out.println("while i marmin }");
                    break;
                case '4':
                    System.out.println(" Paymankan cikl do wahile \n");
                    System.out.println(" do {");
                    System.out.println(" cikli marmin");
                    System.out.println(" }    while(payman)");
                    break;
                case '5':
                    System.out.println(" Paymankan cikl for \n");
                    System.out.println(" for(arjeq ;payman;popoxutyun {");
                    System.out.println("fori  i marmin }");
                    break;
        }

    }
}

