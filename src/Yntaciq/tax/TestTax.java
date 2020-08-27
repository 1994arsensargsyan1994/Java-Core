package Yntaciq.tax;

import java.util.Scanner;

public class TestTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
       double grosincom = sc.nextDouble();
        Tax tx = new Tax();
        NjTax t = new NjTax(grosincom, a, 2);
        double yourTax = t.calcTax();
        double youTaxNj = t.adjustforstudents(yourTax);
        System.out.println("Your Tax : " + youTaxNj);

    }
}
