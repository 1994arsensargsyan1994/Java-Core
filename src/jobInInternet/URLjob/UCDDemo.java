package jobInInternet.URLjob;

import javax.xml.crypto.Data;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDDemo {
    public static void main(String[] args)  throws  Exception{
        int c;
        URL  url = new URL("http://www.internic.net");
        System.out.println(url.toExternalForm());
        URLConnection hpUrl = url.openConnection();
        long d = hpUrl.getDate();
        if (d == 0){
            System.out.println("data not available");
        }else {
            System.out.println("Data "+ new Date(d));
        }
        System.out.println("Type available: "+hpUrl.getContentType());
        d = hpUrl.getExpiration();
        if (d == 0){
            System.out.println("time doing  the are not");
        }
        else {
            System.out.println("Time  doing is "+ new Date(d));
        }
        d = hpUrl.getLastModified();
        if (d == 0){
            System.out.println("Last Modified  not available");
        }else {
            System.out.println("Last Modified "+ new Date(d));
        }
        long len = hpUrl.getContentLengthLong();
        if (len == -1){
            System.out.println("getContentLength  not available");
        }else {

            System.out.println("getContentLength  content: "+new Date(len));
        }
        if (len != 0){
            System.out.println("===Content==");
            InputStream in = hpUrl.getInputStream();
            while (((c = in.read()) != -1)) {
                System.out.print((char) c);
            }
            in.close();
        }
        else {
            System.out.println("Content are not");
        }
    }
}
