package Yntaciq.lesoons7;

import Yntaciq.animal.Cat;

public class Main {
    public static void main(String[] args) {
        DynamicArrayObj obj = new DynamicArrayObj();
        User user = new User("Arsen", "sargsyan");
        User user1 = new User("Merujan", "Unananyan");
        Client client = new Client("1254AB");
        client.setAge(20);
        client.setName("Jekcon");
        client.setSurname("Xoakin");
        obj.add(user);
        obj.add(user1);
        obj.add(client);
            obj.add(5);
           Object o =  obj.get(1);
           User u = (User) o;
        System.out.println(((User) o).getSrname());
    }
}
