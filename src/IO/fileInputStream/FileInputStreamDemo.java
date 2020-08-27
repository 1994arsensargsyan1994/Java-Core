package meIO.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream("text")) {
            System.out.println("Total allowed byte " +( size = f.available()));
            int n = size / 40;
            System.out.println("the first " + n + " bytes, to read from file by method read() ");
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println("\n yet allowed " + f.available());
            System.out.println("to read following " + " byte take turns by method read(b[]) ");
            byte b[] = new byte[n];
            if (f.read(b) != n)
                System.err.println(" can  not to read " + n + " bytes.");
            System.out.println(new String(b, 0, n));
            System.out.println("\nyet allowed byte" + (size = f.available()));
            System.out.println("method skip() skip bytes ");
            f.skip(size/2);
            System.out.println("\n yet allowed " + f.available());
            System.out.println("read  "+ n/2+ " bytes , in finished array");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("can not to read " + n / 2 + " bytes.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\n yet allowed " + f.available());
        } catch (IOException ex){
            System.out.println("Error by input - output "+ex);
        }

        }
    }
