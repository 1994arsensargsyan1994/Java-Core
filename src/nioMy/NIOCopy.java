package nioMy;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        try {
            Path first = Paths.get("/home/arsen/Desktop/fileiscopy .txt");
            Path second = Paths.get("/home/arsen/Desktop/filecopy .txt");
            Files.copy(first,second, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
