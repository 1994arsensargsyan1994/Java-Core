package patokk.ex5;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.5698;
        boolean b = true;
        try (DataOutputStream dataOut =new DataOutputStream(new FileOutputStream("testdata")) ){
            System.out.println("append int i ");
            dataOut.writeInt(i);
            System.out.println("append d");
            dataOut.writeDouble(d);
            System.out.println("append b");
            dataOut.writeBoolean(b);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println();
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {
            i = dataIn.readInt();
            d = dataIn.readDouble();
            b = dataIn.readBoolean();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
