package patokk.ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        System.out.println(args[0]);
        if (args.length != 1) {
            System.out.println("Иcnoльзoвaниe: ShowFile имя_файла");
            return;
        }
            try(FileInputStream fin = new FileInputStream(args[0])){
              do {
                  i = fin.read();
                  if (i != -1) {
                      System.out.print((char) i);
                  }
              }while (i != -1);
            }
            catch (IOException ex){
                System.out.println("Oшибкa при чтении файла");
            }
            }
        }
