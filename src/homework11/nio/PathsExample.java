package homework11.nio;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class PathsExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI("file:/home/arsen/Desktop/data");//uri standart file:/ .......
          Path directory=   Paths.get(uri);
          Path file = Paths.get("/home/arsen/Desktop/data/file1");
            System.out.println(directory.getFileSystem());
            System.out.println(directory.getFileName());
            System.out.println(directory.getRoot());
            System.out.println(directory.getParent());
            System.out.println(Files.isDirectory(directory));
            System.out.println(Files.isRegularFile(directory));
            System.out.println(Files.isSameFile(file,directory));
            System.out.println(Files.isSameFile(file.getParent(),directory));
            Files.write(file,"\nHappy New Yer".getBytes(), StandardOpenOption.APPEND);
       List<String> cor =  Files.readAllLines(file);
            for (String tm :cor) {
                System.out.println(tm);
            }
        }catch (URISyntaxException | IOException e){
            e.printStackTrace();
        }
    }
}
