package egs.les4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas input your name and age:\n");
        File tow = new File("/home/arsen/Desktop/pol");
        BufferedWriter writer = null;
        while (true) {
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("Exit")) {
                return;
            }
            method(str, tow);
            String[] strings = str.split(",");
            try {
                int age = Integer.parseInt(strings[1].trim());
            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }


        }
    }

    private static void method(String str, File file) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(str);
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
