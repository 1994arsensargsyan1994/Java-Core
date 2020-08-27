package nioMy;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitchannelWrite {
    public static void main(String[] args) {
        try (FileChannel myFile = (FileChannel) Files.newByteChannel
                (Paths.get("/home/arsen/Desktop/fileTow.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.READ,
                        StandardOpenOption.CREATE)) {
            ByteBuffer myBuf = ByteBuffer.allocate(28);
            for (int i = 0; i <28 ; i++) {
                myBuf.put((byte) ('A'+ i));
            }
            myBuf.rewind();
            myFile.write(myBuf);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
