package myscanner;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        File file = new File("/home/arsen/Desktop/myAvg.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("2, 3.4, 5, 6, 7.4, 9.1, 10.5, ready");
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        Scanner coin = new Scanner(fileReader);
       coin.useDelimiter(", *");  // ustanova  razdetitela  ... pa  umalchanu  " " probel
        while (coin.hasNext()) {
            if (coin.hasNextDouble()) {
                sum += coin.nextDouble();
                count++;
            } else {
                String str = coin.next();
                if (str.equals("ready")) {
                    break;
                } else {
                    System.out.println("Error Format value");
                    return;
                }
            }
        }
        coin.close();
        System.out.println("подсчета средн "+sum/count);
    }
}
