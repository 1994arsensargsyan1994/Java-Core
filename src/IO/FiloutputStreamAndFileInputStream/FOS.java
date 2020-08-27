package IO.FiloutputStreamAndFileInputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FOS {
    public  static  byte[] getInput() throws Exception{
        byte []buf = new byte[12];
        for (int i = 0; i <buf.length ; i++) {
           buf[i] = (byte) System.in.read();
        }
        return  buf;
    }

    public static void main(String[] args) throws Exception {
        byte[] buf = getInput();
        OutputStream opt1 = new FileOutputStream("/home/arsen/Desktop/fileOan.txt");
        OutputStream opt2 = new FileOutputStream("/home/arsen/Desktop/fileTow.txt");
        OutputStream opt3 = new FileOutputStream("/home/arsen/Desktop/fileTree.txt");
        FileOutputStream opt4 = new FileOutputStream("/home/arsen/Desktop/fileFore.txt");
        System.out.println(opt4.getFD());
        opt4.write(buf);
        opt4.close();
          for (int i = 0; i <12 ; i+=2) {
            opt1.write(buf[i]);
        }
        opt1.close();
        opt2.write(buf);
        opt2.close();
        opt3.write(buf,12/4,12/2);
        opt3.close();
        System.out.println("Finished");
    }
}
