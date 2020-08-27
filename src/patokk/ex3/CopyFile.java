package patokk.ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args)  throws  IOException{
        int i ;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length != 2){
            System.out.println("try now");
            return;
        }
        try {
    fin = new FileInputStream(args[0]);
    fout =new FileOutputStream(args[1]);
    do {
        i = fin.read();
        if (i != -1){
            fout.write(i);
        }

    }while (i != -1);
        }catch (IOException ex){
            System.out.println("Error input and out");
            return;
        }finally {
            try {
                if (fin != null){
                    fin.close();
                }
            }catch (IOException ex){
                System.out.println("Error the close in the file");
            }
            try {
                if (fin != null){
                    fin.close();
                }
            }catch (IOException ex){
                System.out.println("Error the close in the file");
            }
        }
    }
}

