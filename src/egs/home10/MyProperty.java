package egs.home10;


import com.google.gson.Gson;
import egs.home7.User;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

public class MyProperty {
    private static final String FILE_PATH = "/home/arsen/Desktop/GsonWriter/GsonFileProp";
    private static final String INTERNET_PATH = "https://jsonplaceholder.typicode.com/todos";
    private static final String PROP_FILE = "/home/arsen/Desktop/prop/property.txt";
    private static final String KEY = "json";


    public static void main(String[] args) {
        Gson gson = null;
        String gsonText = null;
        try {
            URL url = new URL(INTERNET_PATH);
            URLConnection connection = url.openConnection();
            connection.connect();
        } catch (IOException e) {
            gsonText = readJsonFromLocalFile();
        }
        try {
            gsonText = readJsonFromUrl(method(INTERNET_PATH));
        } catch (IOException e) {
            System.out.println("Internet Not Connected this json is local file");
        }
        fromStringArrayToGson(gsonText);
    }

    public static Properties method(String url) {
        Properties prop = null;
        try (OutputStream output = new FileOutputStream(PROP_FILE)) {

            prop = new Properties();

            prop.setProperty(KEY, url);

            // save properties to project root folder
            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        }
        return prop;
    }

    public static String readJsonFromUrl(Properties prop) throws IOException {
        try (InputStream input = new FileInputStream(PROP_FILE)) {

            prop = new Properties();

            // load a properties file
            prop.load(input);

            StringBuilder sb = new StringBuilder();
            String str;
            InputStream inJson = new URL(prop.getProperty(KEY)).openStream();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inJson))) {
                while ((str = bufferedReader.readLine()) != null) {
                    sb.append(str);
                    writeJsonLocalFile(str);
                }

            } finally {
                inJson.close();
            }
            return sb.toString();
        }

    }

    public static void writeJsonLocalFile(String gsonText) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bufferedWriter.write(gsonText);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readJsonFromLocalFile() {
        StringBuilder sb = new StringBuilder();
        String str;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            while ((str = bufferedReader.readLine()) != null) {
                sb.append(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void fromStringArrayToGson(String gsonText) {
        Gson gson = new Gson();
        User[] users = gson.fromJson(gsonText, User[].class);
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
