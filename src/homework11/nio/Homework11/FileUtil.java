package homework11.nio.Homework11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<String> search(String searchPath, String searchMask) throws IOException {
        List<String> stringList =new ArrayList<>();
        String startWith = "";
        String endWith = "";
        for (int i = 0; i < searchMask.length(); i++) {
            if (searchMask.charAt(i) == '*') {
                startWith = searchMask.substring(0, i);
                endWith = searchMask.substring(i + 1, searchMask.length());
            }
        }
        printFilesByName(searchPath,startWith,endWith,stringList);

        return stringList;
    }
    private  static  void printFilesByName( String searchPath, String startWith, String endWith ,List<String>list){
        File file = new File(searchPath);
        File[] files = file.listFiles();
        for (File value: files) {
            if (value.isFile()){
                if (value.getName().startsWith(startWith) && value.getName().endsWith(endWith)){
                    list.add(value.getAbsolutePath());
                    System.out.println(value.getAbsolutePath());
                }
            } else {
                printFilesByName(value.getAbsolutePath(), startWith, endWith,list);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        search("/home/arsen/Desktop/data","*CV*.pdf");
    }
}
