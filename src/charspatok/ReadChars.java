package charspatok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars  {
    public static void main(String[] args)  throws IOException {
        char c ;
        String st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input chars while input << . >> ");
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        }while (c != '.');
        do {
            st = br.readLine();
            System.out.println(st);
        }while (!st.equals("stop"));
    }

}
