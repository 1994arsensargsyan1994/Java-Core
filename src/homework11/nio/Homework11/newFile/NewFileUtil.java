package homework11.nio.Homework11.newFile;

import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class NewFileUtil {
    public static List<String> search(String searchPath, String searchMask) throws IOException {
        if (searchPath == null || searchMask == null
                || searchPath.trim().isEmpty() || searchMask.trim().isEmpty()) {
            throw new InvalidParameterException("SerarcPath or SearchMask cen not be null or empty");
        }
        File directory = new File(searchPath);
        if (directory.isFile() ) {

        }
        if (!directory.exists()){
            throw new InvalidParameterException("SerarcPath or SearchMask cen not be null or empty");
        }

        List<String> result = new ArrayList<>();
        search0(directory, result, searchMask);


        return result;

    }

    private static void search0(File directory, List<String> result, String searchMask) {
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                search0(file, result, searchMask);
            } else if (isNameMatching(file.getName(), searchMask)) {
                result.add(file.getAbsolutePath());
            }
        }
    }

    private static boolean isNameMatching(String filename, String searchMask) {
        int tmp =0;
        if ("*".equals(searchMask)) {
            return true;
        } else if (searchMask.startsWith("*") && searchMask.endsWith("*")
                && filename.contains(searchMask.substring(0, searchMask.length() - 1))) {
            return true;
        } else if (searchMask.startsWith("*") && filename.endsWith(searchMask.substring(1))) {
            return true;

        } else if (searchMask.endsWith("*") && filename.startsWith(searchMask.substring(0, searchMask.length() - 1))) {
            return true;
        }else if (!searchMask.startsWith("*") && (!searchMask.endsWith("*")&& !filename.equals(searchMask))){
            for (int i = 0; i < searchMask.length(); i++) {
                if (searchMask.charAt(i) == '*') {
                    if (filename.contains(searchMask.substring(0,i))
                            || filename.contains(searchMask.substring(i+1,searchMask.length()))) {
                        return true;
                    }
                }
            }
        }
        return filename.equals(searchMask);
    }

    public static void main(String[] args) throws IOException {
        List<String> list = search("/home/arsen/Desktop/data", "CV*.txt");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
