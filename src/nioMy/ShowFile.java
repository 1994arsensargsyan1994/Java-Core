package nioMy;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShowFile {
    public static void main(String[] args) {
        int i ;
        try(InputStream  fin = Files.newInputStream(Paths.get("/home/arsen/Desktop/filecopy .txt"))) {
        do {
            i = fin.read();
            if (i != - 1){
                System.out.print((char) i);
            }
        }while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
