package egs.home5;

import org.json.*;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;


public class MyJson {
    private static final String FILE_PATH = "/home/arsen/Desktop/JsonWriter/jsonFile1";
    private static final String INTERNET_PATH = "https://api.bigdatacloud.net/data/client-ip";

    public static void main(String[] args) {
        JSONObject json = null;
        URLConnection connection = null;
        try {
            URL url = new URL(INTERNET_PATH);
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (connection.getContentLength() == -1) {
            json = readJsonFromLocalFile();
            print(json);

        } else {
            try {
                json = readJsonFromUrl(INTERNET_PATH);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (json == null) {
                throw new NullPointerException();
            } else {
                print(json);
            }
        }
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException {
        StringBuilder sb = new StringBuilder();
        String str;
        InputStream inJson = new URL(url).openStream();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inJson))) {
            while ((str = bufferedReader.readLine()) != null) {
                sb.append(str);
                writeJsonLocalFile(str);
            }

        } finally {
            inJson.close();
        }
        String jsonText = sb.toString();
        return new JSONObject(jsonText);
    }

    public static void writeJsonLocalFile(String jsonText) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bufferedWriter.write(jsonText);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static JSONObject readJsonFromLocalFile() {
        StringBuilder sb = new StringBuilder();
        String str;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            while ((str = bufferedReader.readLine()) != null) {
                sb.append(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String jsonText = sb.toString();
        return new JSONObject(jsonText);
    }

    public static void print(JSONObject json) {
        String[] array = json.toString().split(",");
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void printSing(JSONObject json) {
        System.out.println(json);
    }


//    public static void toJsonObject(String jsonText) {
//        Map<String, Object> map = new HashMap<>();
//        String[] array = jsonText.split(",");
//        List<String> list = new ArrayList<String>(Arrays.asList(array));
//        int i = 0;
//        int j = i + 1;
//        for (i = 0; i < list.size() - 1; i++) {
//            map.put(list.get(i), list.get(j));
//
//        }
//
//        Set<String> set = map.keySet();
//        for (String s : set) {
//            System.out.println(s);
//        }
//        IPAddress address = new IPAddress();
//
//
//    }
}
