package egs.les4;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File oan = new File("/home/arsen/Desktop/mywork/file1");
        File tow = new File("/home/arsen/Desktop/fil");
        if (!oan.exists()){
            oan.createNewFile();
        }
        try {
            copy(oan, tow);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copy(File source, File des) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(source));
        BufferedWriter writer = new BufferedWriter(new FileWriter(des));
        String str;
        while ((str = reader.readLine()) != null) {
            writer.write(str.toUpperCase());
        }
        reader.close();
        writer.close();


    }

}
