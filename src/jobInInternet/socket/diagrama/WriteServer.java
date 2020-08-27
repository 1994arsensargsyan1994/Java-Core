package jobInInternet.socket.diagrama;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class WriteServer {
   public  static int serverPort = 998;
   public  static int clientPort = 999;
   public  static int bufferSize = 1024;
   public static DatagramSocket ds;
   public  static byte[]buffer = new byte[bufferSize];
     public  static  void serverTest() throws  Exception{
         int pos = 0;
         while (true){
             int c = System.in.read();
             switch (c){
                 case -1:
                     System.out.println("Server the end ");
                     ds.close();
                     return;
                 case '\r':
                     break;
                 case '\n':
                     ds.send(new DatagramPacket(buffer,pos, InetAddress.getLocalHost(),clientPort));
                     pos = 0;
                     break;
                 default:
                     buffer[pos++] = (byte)c;
             }
         }
     }
     public  static  void theClient()throws  Exception{
         while (true){
             DatagramPacket p = new DatagramPacket(buffer,bufferSize);
             ds.receive(p);
             System.out.println(new String(p.getData(),0,p.getLength()));
         }
     }
    public static void main(String[] args) throws  Exception{
           if (args.length == 1){
               ds= new DatagramSocket(serverPort);
           }else {
               ds = new DatagramSocket(clientPort);
               theClient();
           }
    }
}