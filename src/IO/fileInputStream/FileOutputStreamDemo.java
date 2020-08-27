package meIO.fileInputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = " Now is the time for all good me\n " +
                " to come to the aid of the ir count y \n " +
                " and рау the ir due taxes . " ;
        byte []buf =source.getBytes();
        File oan = new File("/home/arsen/Desktop/file1");
        File tow = new File("/home/arsen/Desktop/file2");
        File tree = new File("/home/arsen/Desktop/file3");
        try (FileOutputStream f0 = new FileOutputStream(oan);
             FileOutputStream f1 = new FileOutputStream(tow) ;
             FileOutputStream f2 = new FileOutputStream(tree)) {
            for (int i = 0; i <buf.length ; i+=2) {
                f0.write(buf[i]);
            }
            f1.write(buf);
            f2.write(buf,buf.length-buf.length/4,buf.length/4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
