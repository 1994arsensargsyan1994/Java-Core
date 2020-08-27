package jobInInternet.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIs {
    public static void main(String[] args) throws   Exception {
        int c;
        Socket socket = new Socket("whois.internic.net",43);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        String str =(args.length == 0 ? "MHProfessionalcom" : args[0])+"\n";
        byte []buf=str.getBytes();
        out.write(buf);
        while((c = in.read())!= -1){
            System.out.print((char)c);
        }
        socket.close();
    }
}
