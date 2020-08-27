package IO.fileAndDirectory;

import java.io.File;
import java.io.FilenameFilter;

public class DL implements FilenameFilter {
    public static void main(String[] args) {
        String patch = "/home/arsen/Desktop/data";
        File file = new File(patch);
        if (file.isDirectory()) {
            System.out.println("Tis directory of: " + patch);
            File[] a = file.listFiles();
            for (int i = 0; i < a.length; i++) {
//              File file1 = new File(patch+"/"+s[i]);
             System.out.println(a[i].getName()+(a[i].isDirectory() ? " is s directory":" is a file"));
            }
        }else
            System.out.println(" is a nor directory!");
    }

    @Override
    public boolean accept(File file, String s) {
        return false;
    }
}
