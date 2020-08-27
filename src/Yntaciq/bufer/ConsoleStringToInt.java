package Yntaciq.bufer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleStringToInt {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] masStr = new String[3];
        int[] masInt = new int[3];
        try {
            System.out.println("Greq 3 tiv");
            System.out.println("Enter");
            for (int i = 0; i <3 ; i++) {
                masStr[i] = br.readLine();
                masInt[i] = Integer.parseInt(masStr[i]);
            }
            System.out.println("Masiv : ");
            for (int i = 0; i < 3; i++) {
                System.out.print(masInt[i]+",");
            }
        }catch (IOException ex){
            System.out.println("oshibka vvoda :"+ ex);
        }catch (NumberFormatException ex){
            System.out.println("nepravlni format chisl :"+ex);
        }
    }
}
