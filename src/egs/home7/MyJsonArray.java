package egs.home7;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyJsonArray {
    private static final String FILE_PATH = "/home/arsen/Desktop/JsonWriterArray/jsonFileArray";
    private static final String INTERNET_PATH = "https://jsonplaceholder.typicode.com/todos";

    public static void main(String[] args) throws IOException, InterruptedException {
        JSONArray jsonArray = null;
        try {
            URL url = new URL(INTERNET_PATH);
            URLConnection connection = url.openConnection();
            connection.connect();
        } catch (IOException e) {
            jsonArray = readJsonFromLocalFile();
        }
        try {
            jsonArray = readJsonFromUrl(INTERNET_PATH);
        } catch (IOException e) {
            System.out.println("Internet Not Connected this json is local file");
        }
        printSing(jsonArray);
    }

    public static JSONArray readJsonFromUrl(String url) throws IOException {
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
        return new JSONArray(jsonText);
    }

    public static void writeJsonLocalFile(String jsonText) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bufferedWriter.write(jsonText);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static JSONArray readJsonFromLocalFile() {
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
        return new JSONArray(jsonText);
    }

    public static void printSing(JSONArray json) {
        List<User> userList = new LinkedList<>();

        for (int i = 0; i <json.length(); i++) {

            JSONObject jsonObject = json.getJSONObject(i);
            User user = new User();
            user.setId(jsonObject.getInt("id"));
            user.setCompleted(jsonObject.getBoolean("completed"));
            user.setTitle(jsonObject.getString("title"));
            user.setUserId(jsonObject.getInt("userId"));
            userList.add(user);
        }
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
//        String[] array = jsonText.split("},");
//        List<String> list =new  ArrayList<>()
//        for (int i = 0; i <array.length ; i++) {
//            list.add(array[i]+"}".trim());
//            if (i == array.length-1){
//                list.add(array[i].trim());
//            }
//        }
//        for (String s : list) {
//            System.out.println(s);
//        }
//        Gson gson = new Gson();
//        for (String s : list) {
//           User user = gson.fromJson(s,User.class);
//           userList.add(user);
//        }
//        for (User user : userList) {
//            System.out.println(user.toString());
//        }

}
