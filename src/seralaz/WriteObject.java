package seralaz;

import job.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person pers = new Person(18,"Google","Lelia");
        Person pers1 = new Person(18,"IDea","Duglas");
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pers);
            oos.writeObject(pers1);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Person[] people = {new Person(58,"opo","Arsen"),new Person(58,"Alliexperes","Armen"),
                new Person(58,"opo","Andre")};
        try {
            FileOutputStream fos1 = new FileOutputStream("people1.bin");
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
            oos1.writeObject(people);
            oos1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
