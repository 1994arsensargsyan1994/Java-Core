package patokk.ex6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompFile {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 0, j = 0;
        try (FileInputStream f1 = new FileInputStream("Second");
             FileInputStream f2 = new FileInputStream("First")) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j){
                    break;
                }

            } while (i != -1 && j != -1);
            if (i != j ){
                System.out.println("Coдepжимoe файлов отличается)");
            }else
                System.out.println("\"Coдepжимoe файлов savpdayet ");

        }catch (IOException ex){
            System.out.println("Error input and out "+ex);
        }
    }
}
