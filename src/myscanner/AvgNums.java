package myscanner;

import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        Scanner coin = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        System.out.println("вeдитe числа для подсчета средн его ");
        while (coin.hasNext()) {
            if (coin.hasNextDouble()) {
                sum += coin.nextDouble();
                count++;
            }else {
                String str = coin.next();
                if (str.equals("ready")){
                    break;
                }else {
                    System.out.println("Error Format value");
                    return;
                }
            }
        }
        coin.close();
        System.out.println("подсчета средн"+sum/count);
    }
}
