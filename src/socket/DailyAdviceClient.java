package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DailyAdviceClient {
    public  void go(){
        try {
            Socket s = new Socket("127.0.0.1",4242);
            InputStreamReader stream = new InputStreamReader(s.getInputStream());
            BufferedReader buf = new BufferedReader(stream);
            String advice = buf.readLine();
            System.out.println("today you are have to "+advice);
            buf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient oan = new DailyAdviceClient();
        oan.go();
    }
}
