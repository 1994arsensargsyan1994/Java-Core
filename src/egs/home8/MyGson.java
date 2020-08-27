package egs.home8;

import com.google.gson.Gson;
import egs.home7.User;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MyGson {
    private static final String FILE_PATH = "/home/arsen/Desktop/GsonWriter/GsonFile";
    private static final String INTERNET_PATH = "https://jsonplaceholder.typicode.com/todos";

    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = null;
        String gsonText =null;
        try {
            URL url = new URL(INTERNET_PATH);
            URLConnection connection = url.openConnection();
            connection.connect();
        } catch (IOException e) {
            gsonText = readJsonFromLocalFile();
        }
        try {
            gsonText = readJsonFromUrl(INTERNET_PATH);
        } catch (IOException e) {
            System.out.println("Internet Not Connected this json is local file");
        }
      //  fromStringToGson(gsonText);   /////////////////////////
       // fromString(gsonText);///////////////////
        fromStringArrayToGson(gsonText);
    }

    public static String readJsonFromUrl(String url) throws IOException {
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
        return sb.toString();
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
    private static void fromStringToGson(String jsonText) {
        List<User> userList = new ArrayList<>();
        Gson gson = new Gson();
        JSONArray jsonArray = new JSONArray(jsonText);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            User u = gson.fromJson(jsonObject.toString(),User.class);
            userList.add(u);
        }
        for (User user : userList) {
            System.out.println(user.toString());
        }

    }
    private static void fromString(String jsonText) {
        List<String> list = new ArrayList<>();
        List<User> userList = new ArrayList<>();
        String newJsonText = jsonText.substring(1, jsonText.length() - 1);
//       String newJsonText2 = jsonText.substring(newJsonText.length()-2).trim();
        String[] array = newJsonText.replace("}", ">").split(">");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                list.add(array[i]);
            }else {
                list.add(array[i] + "}");
            }
        }
        Gson gson = new Gson();
        int b = list.size()-1;
        int a = 0;
        for (int i = 0; i <b; i++) {
            String s = list.get(i);
            if (a == 0) {
                User user = gson.fromJson(s.replaceAll("\\s", ""), User.class);
                userList.add(user);
                a++;
            } else {
                s = s.substring(1, s.length());     //-1)+"}"
                User user = gson.fromJson(s.replaceAll("\\s", ""), User.class);
                userList.add(user);
            }
        }
        for (User user : userList) {
            System.out.println(user.toString());
        }


    }
    public static void fromStringArrayToGson(String gsonText){
        //List<User> userList = new ArrayList<>();
        Gson gson = new Gson();
            User[] users = gson.fromJson(gsonText,User[].class);
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
