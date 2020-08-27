package egs.home11;

import java.io.*;
import java.util.Scanner;

public class INOU {
    public  static  String PATCH = "/home/arsen/Desktop/work/myAvg.txt";
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str;
        Scanner scanner = new Scanner(System.in);
        try( BufferedWriter writer = new BufferedWriter(new FileWriter(PATCH))) {


            str = scanner.nextLine();
            writer.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader( new FileReader(PATCH))){
            String  str1;
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
