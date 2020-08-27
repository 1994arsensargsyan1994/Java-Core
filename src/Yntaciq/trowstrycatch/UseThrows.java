package Yntaciq.trowstrycatch;

import java.io.IOException;

public class UseThrows {
    public  static  char prompt(String str) throws java.io.IOException{
        System.out.println(str + ": ");
        return (char)  System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = prompt("Enter element");
        }catch (IOException exc){
            System.out.println("Пpoизoшлo исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Bы нажали клавишу " + ch);
    }
}
