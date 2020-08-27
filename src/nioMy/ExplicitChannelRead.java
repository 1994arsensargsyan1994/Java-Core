package nioMy;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        //Path path = null;
//        try {
//          //  path = Paths.get("/home/arsen/Desktop/fileTow.txt");
//        }catch (InvalidParameterException ex){
//            System.out.println("Patch error "+ ex);
//            return;
//        }
        // can doing the same try catch
        try (SeekableByteChannel skb = Files.newByteChannel(Paths.get("/home/arsen/Desktop/fileTow.txt"))){
            ByteBuffer mybuf = ByteBuffer.allocate(128);
            do {
                count = skb.read(mybuf);
                if (count != -1){
                    mybuf.rewind();
                    for (int i = 0; i <count ; i++) {
                        System.out.print((char) mybuf.get());
                    }
                }
            }while (count != -1);
        } catch (InvalidParameterException | IOException ex){
            ex.printStackTrace();
        }
    }
}
