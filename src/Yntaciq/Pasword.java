package Yntaciq;

import java.util.Scanner;

public class Pasword {
    public static void main(String[] args) {
        String login = "Admin";
        String pasworld = "PasWorD";
        Scanner sc = new Scanner(System.in);
        System.out.println("Grir Loginy ");
        String userLogin = sc.next();
        if (login.equals(userLogin)) {
            System.out.println("Grir paswordy");

            String userpasword = sc.next();

            if (pasworld.equals(userpasword)) {
                System.out.println("BAri galust " + userLogin);
            } else {
                System.out.println("Duq sxaleq havaqel paswordy");
            }
        }
        else {
            System.out.println("Sxal Login");
        }
    }


}
