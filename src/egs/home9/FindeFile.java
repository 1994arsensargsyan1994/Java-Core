package egs.home9;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindeFile {
    String ext;
    private  static String patch = "/home/arsen/";
    public static void main(String[] args) {
        List<String> a;
     //   a = findFile("Desktop/htmldemo");
        a = findByFormat("Desktop/apache-tomcat-9.0.31",".txt");
        for (Object o : a) {
            System.out.println(o);
        }
    }

    public static List<String> findFile(String str) {
        str = patch + str;
        List<String> list = new ArrayList<>();
        File file = new File(str);
        File [] files = file.listFiles();
        for (File file1 : files) {
            list.add(file1.getName());
        }


        return list;
    }
    public  static  List<String> findByFormat(String patchLoc,String format){
         patch += patchLoc;
        List<String> list = new ArrayList<>();
        File file = new File(patch);
        File [] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                File [] filesIsDir = file1.listFiles();
                for (File file2 : filesIsDir) {
                    if (file2.getName().endsWith(format)) {
                        list.add(file2.getName());
                    }
                }
            }
            if (file1.getName().endsWith(format)){
                list.add(file1.getName());
            }
        }
       return  list;

    }

}
