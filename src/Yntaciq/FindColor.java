package Yntaciq;

import java.util.Scanner;

public class FindColor {
    public static void main(String[] args) {
        System.out.println("Gushaq guyny 5 pordzic");
        System.out.println("Dus galu hamar greq exit");
        final int MAX_PAPITKA= 5;
        int papitka = 0;
        String color = "red";
        Scanner in = new Scanner(System.in);
        while (papitka < MAX_PAPITKA)
        {
            papitka ++;
            String value = in.next();
            System.out.println("Duq areciq " + papitka+ "  :pordzy") ;
            if (value.equals("exit"))
                break;
            if (!value.equals(color))
                continue;
            System.out.println("Duq gushakeciq " + papitka + " pordic");
            break;
        }
        System.out.println("GAme Over");
    }
}
