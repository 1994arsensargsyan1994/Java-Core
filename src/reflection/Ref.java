package reflection;

import Yntaciq.lesoons7.User;
import animal.Cat;
import generic.ex3.MyClass;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

public class Ref {
    public static void main(String[] args) throws NoSuchFieldException {
        User obj = new User();
        MyClass a = new MyClass();
        Class aclass;
        Class iclass;
        System.out.println(aclass = a.getClass());
        iclass = Integer.class;
       // Class c = Class.forName("com.mysql.jdbc.Driver");
        String name = aclass.getName();
        Class cl = obj.getClass();
        int mods = cl.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
        System.out.println("___________________");
        Class lc = LinkedList.class;
        Class[] interfaces = lc.getInterfaces();
        for (Class cInterface : interfaces) {
            System.out.println(cInterface.getName());
        }
        System.out.println("____________________________");
        Cat cat = new Cat();
        Class catClass = cat.getClass();
        Field[] publicField = catClass.getFields();
        for (Field field : publicField) {
            Class fieldTyp = field.getType();
            System.out.println("name field "+field.getName());
            System.out.println("typ field "+fieldTyp.getName());
        }
        System.out.println("_________________________");
        Cat newCat = new Cat();
        Class newCatClass = newCat.getClass();
        Field field = newCatClass.getField("age");
        System.out.println("_______________________");
        Field[] publicField1 = catClass.getDeclaredFields();
        for (Field field1 : publicField1) {
            Class fieldTyp = field1.getType();
            System.out.println("name field "+field1.getName());
            System.out.println("typ field "+fieldTyp.getName());
            System.out.println(field1.getModifiers());
        }
    }
}
