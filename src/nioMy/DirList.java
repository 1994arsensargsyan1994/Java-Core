package nioMy;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.InvalidParameterException;

public class DirList {
    public static void main(String[] args) {
        String name = "Arsen";
        String dirName = "/home/arsen/Desktop/"+name;
        try (DirectoryStream<Path> dirstr = Files.newDirectoryStream(Paths.get(dirName))) {
            System.out.println("Directory name "+ dirName);
            for (Path entry : dirstr) {
                BasicFileAttributes attributes =Files.readAttributes(entry,BasicFileAttributes.class);
                if (attributes.isDirectory()){
                    System.out.print("<DIR>");
                }
                else {
                    System.out.print("\t ");
                }
                System.out.println(entry.getName(1));
            }

        } catch (InvalidParameterException | IOException ex){
            ex.printStackTrace();
        }
    }
}
