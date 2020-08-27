package egs.home12;

import com.google.gson.JsonObject;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.*;

public class MyGsonObject {
    private static final String FILE_PATH = "/home/arsen/Desktop/myJsonString/myAvg.txt";

    public static void main(String[] args) {
        try {
            new MyGsonObject().go();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void go() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String jsonText = readJsonString(FILE_PATH);
        Book b = fromJson(jsonText, Book.class);

        System.out.println("book = " + b);
    }

    private String readJsonString(String path) {
        File file = new File(path);
        StringBuilder stringBuilder = new StringBuilder();
        String str = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((str = bufferedReader.readLine()) != null) {
                stringBuilder.append(str);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public <T> T fromJson(String json, Class<T> c) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

//        User user = new User();
        Constructor constructor = c.getConstructor();
        Object object = constructor.newInstance();
        Field[] fields = c.getDeclaredFields();
        JSONObject jsonObject = new JSONObject(json);
        for (Field field : fields) {
            String fieldName ;
            field.setAccessible(true);
            if (field.isAnnotationPresent(MySerializeName.class)){
                MySerializeName mySerializeName = field.getAnnotation(MySerializeName.class);
                fieldName = mySerializeName.value();
            }else {
                fieldName = field.getName();
            }
            field.set(object,jsonObject.get(fieldName));
        }


        return (T) object;
    }
}






//    Method method = c.getDeclaredMethod("set" + field.getName(), null);
//            method.setAccessible(true);
//                    method.invoke(user, value);