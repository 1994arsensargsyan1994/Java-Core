package seralaz;

import job.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person pers = (Person) ois.readObject();
            Person pers1 = (Person) ois.readObject();
            System.out.println(pers);
            System.out.println(pers1);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("____________________________________________");
  try {
      FileInputStream fis1 = new FileInputStream("people1.bin");
      ObjectInputStream ois1 = new ObjectInputStream(fis1);
      Person []people = (Person[]) ois1.readObject();
      System.out.println(Arrays.toString(people));
  } catch (ClassNotFoundException e) {
      e.printStackTrace();
  }

    }
}
