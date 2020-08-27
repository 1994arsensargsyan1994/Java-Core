package fileutil;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileUtil implements FilenameFilter {
    String ext;

    @Override
    public boolean accept(File file, String s) {
        return s.endsWith(ext);
    }

    public FileUtil(String ext) {
        this.ext = ext;
    }

    public static ArrayList<String> search(String searchPath, String searchMask) {
        int time = 0;
        int timeTow = 0;
        String newSearchMask = searchMask;
        String newSearchMaskFirst = searchMask;
        String newSearchMaskLast = searchMask;
        ArrayList<String> a = new ArrayList<>();
        File file = new File(searchPath);
        int aInt = 0;
        int bInt = 0;
        if (searchMask.charAt(0) != '*') {
            for (int i = 0; i < searchMask.length(); i++) {
                bInt++;
                if (newSearchMask.charAt(i) == '*') {
                    timeTow = i;
                    newSearchMask = newSearchMask.substring(i);
                    for (int j = 0; j < newSearchMask.length(); j++) {
                        aInt++;
                    }
                    break;
                }
            }
        }
        if (aInt > 0 && bInt > 0) {
            newSearchMaskFirst = newSearchMaskFirst.substring(0, timeTow);
            newSearchMaskLast = newSearchMaskLast.substring(timeTow).replace('*', '.');
            FilenameFilter filter = new FileUtil(newSearchMaskLast);
            File[] global = file.listFiles();
            File[] global1 = file.listFiles(filter);
            for (int i = 0; i < global1.length; i++) {
                a.add(global1[i].getName());
            }
            for (int i = 0; i < global.length; i++) {
                if (global[i].getName().substring(0, timeTow).equals(newSearchMaskFirst)) {
                    a.add(global[i].getName());
                }
            }
            return a;
        }

        if (searchMask.equals("*")) {
            File[] f = file.listFiles();
            for (int i = 0; i < f.length; i++) {
                a.add(f[i].getName());
            }
            return a;
        } else if (searchMask.compareTo("*") != 0) {
            if (searchMask.charAt(0) == '*') {
                searchMask = searchMask.replace('*', '.');
                FilenameFilter filter = new FileUtil(searchMask);
                File[] f1 = file.listFiles(filter);
                for (int i = 0; i < f1.length; i++) {
                    a.add(f1[i].getName());
                }
                return a;
            }
            if (searchMask.charAt(0) != '*') {
                for (int i = 0; i < searchMask.length(); i++) {
                    if (searchMask.charAt(i) == '*') {
                        time = i;
                        searchMask = searchMask.substring(0, i);
                    }
                }
                File[] f1 = file.listFiles();
                for (int j = 0; j < f1.length; j++) {
                    if (f1[j].getName().substring(0, time).equals(searchMask)) {
                        a.add(f1[j].getName());
                    }
                }
            }
            return a;
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> list;
        list = search("/home/arsen/Desktop/project", "Ars*");
        print(list);

    }

    public static void print(ArrayList<String> filename) {
        for (String file : filename) {
            System.out.println(file);
        }
    }


}

