package weobjectdynamic;

import Yntaciq.lesoons7.User;
import sargsyanarsen.DynamicArray;

public class Main {
    public static void main(String[] args) {
       DynamicObject obj = new DynamicObject(16);
        User user = new User("Vardan ","Urumyan");
        User user1 = new User("Vardanik ","Urumyanik");
       obj.add(5);
       obj.add("Hello!!!");
       obj.add(user);
       obj.add(user1);
//        System.out.println(obj.getSize());
        User u =  obj.castInsans(obj.get(3));







    }
}
