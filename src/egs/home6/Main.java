package egs.home6;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Human human1 = new Human(25,"Arsen");
        Human human2 = new Human(32,"Valod");
        Human human3 = new Human(25,"Karen");
        Gson gson = new Gson();
        String a = gson.toJson(human1);
        System.out.println(a);
        System.out.println("______________________________");
        Gson gson1 = new Gson();
        Human human = gson1.fromJson(a,Human.class);
        System.out.println(human.toString());

    }
    
}
