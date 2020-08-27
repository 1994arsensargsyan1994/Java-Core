package myCollection.mypropertis;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args)  throws  IOException{
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name ,number;
        File file = new File("/home/arsen/Desktop/fileiscopy .txt");
        FileInputStream fin = null;
        boolean changed = false;
        try {
            fin = new FileInputStream(file);
        }catch (IOException e ){
          e.printStackTrace();
        }
        try {
           if(fin != null){
               ht.load(fin);
               fin.close();
           }
        }catch (IOException e){
            e.printStackTrace();
        }
        do{
            System.out.println("input name by exit input 'Exit'");
            name = br.readLine();
            if (name.equals("exit")){
                continue;
            }
            System.out.println("input number ");
            number = br.readLine();
            ht.put(name,number);
            changed = true;
        }while (!name.equals("exit"));
        if (changed){
            FileOutputStream fout = new FileOutputStream(file);
            ht.store(fout,"phonBook");
            fout.close();
        }
        do {
            System.out.println("input by search name and 'exit' by close ");
            name= br.readLine();
            if (name.equals("exit")){
                continue;
            }
            number =(String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("exit"));
    }
}
