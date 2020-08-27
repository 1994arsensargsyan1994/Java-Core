package jobInInternet.socket.simpleserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        ServerSocket s = null;
        try {
             s= new ServerSocket(5432);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        while (true){
            try {
                assert s != null;
                Socket s1 = s.accept();
                OutputStream out = s1.getOutputStream();
                DataOutputStream ds =new DataOutputStream(out);
                ds.writeUTF("Hello Net World");
                ds.close();
                s1.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
