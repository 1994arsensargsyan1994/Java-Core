package charspatok.cllasfilewrairer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {
    public static void main(String[] args) {
        String str;
        try (BufferedReader br = new BufferedReader(new FileReader("Second"))){
            while((str = br.readLine())  != null) {
                System.out.println(str);
            }
        }catch (IOException exc){
            System.out.println("error input output" + exc);
        }
    }
}
