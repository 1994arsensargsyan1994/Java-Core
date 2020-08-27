package patokk.ex1;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[10];
        System.in.read(b);
        for (int i = 0; i <b.length ; i++) {
            System.out.print((char) b[i]);
        }
    }
}
