package Yntaciq.boxnew;

import Yntaciq.lesoons7.Client;
import Yntaciq.lesoons7.User;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Object o = new Object();
        User user = new User("Arsen","Sargsyan");
        Client client = new Client("125ABC");
        objBox.add(o);
        objBox.add(user);
        objBox.add(client);

        }
    }
