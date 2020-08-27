package lesson10.io;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        //   \  /
        File directory = new File("C:\\Users\\User\\Desktop\\data");
        File d1 = new File(directory, "a");
        boolean is = d1.mkdir();

        File d2 = new File(directory, "x\\y\\z");
        boolean is1 =  d2.mkdirs() ;

        System.out.println(directory.isDirectory());
        System.out.println(directory.isFile());
        try {
            System.out.println(directory.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(directory, "a.txt");
        System.out.println(file.exists());

        try {
            file.createNewFile();
            System.out.println(file.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }

      writeTextIntoFile(file, "Hello from Armenia.");

        String text = readTextFromFile(file);
        System.out.println(text);
        Reader reader = new FileReader(file);

       new BufferedReader(reader).readLine();

    }

    public static void writeTextIntoFile(File file, String text) {
        if (file == null || !file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException("Wrong data");
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            // do not live blank catch block ever
            e.printStackTrace();
        }

    }

    public static String readTextFromFile(File file) {
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                builder.append((char) ch);
            }
        } catch (IOException e) {
            // do not live blank catch block ever
            e.printStackTrace();
        }
        return builder.toString();
    }

}
