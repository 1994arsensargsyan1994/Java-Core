package patokk.inputoutputEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String helpfile;

    public Help(String helpfile) {
        this.helpfile = helpfile;
    }
    boolean helpon(String what){
        int ch;
        String topic,info;
        try (BufferedReader helpRed = new BufferedReader(new FileReader(helpfile))){
            do {
                ch = helpRed.read();
                if (ch == '#'){
                    topic = helpRed.readLine();
                    if (what.compareTo(topic)==0){
                        do {
                            info = helpRed.readLine();
                            if (info != null) System.out.println(info);
                        }while ((info != null) && (info.compareTo("") !=0));
                        return  true;
                    }
                }
            }while (ch != -1);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error by try open the file ");
            return  false;
        }
        return  false;
    }
    String getSelection(){
        String topic = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" write typ");
        try {
            topic = br.readLine();
        } catch (IOException e) {
            System.out.println("error by read in cancol");
        }
        return  topic;

    }

}
class FileHelp{
    public static void main(String[] args) {
        Help help = new Help("testdata");
        String topic;
        System.out.println("input selection \n"+" input stop for exit");
        do {
            topic = help.getSelection();
            if (!help.helpon(topic)){
                System.out.println("typ did not find\n");
            }
        }while (topic.compareTo("stop")!= 0);
    }
}

