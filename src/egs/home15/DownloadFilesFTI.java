package egs.home15;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFilesFTI {
    public static void main(String[] args) {
     if(args.length != 2){
         System.out.println(" java FilesDownload URL outputFilename");
         System.exit(0);
     }
        InputStream inputStream=null;
        FileOutputStream fOut = null;
        BufferedInputStream bIut = null;
        System.out.println("Downloading "+ args[0]);
        try {
            URL url = new URL(args[0]);
            URLConnection urlConnection = url.openConnection();
            fOut = new FileOutputStream("/home/arsen/Desktop/mp3Doc/song.mp3");
            inputStream = urlConnection.getInputStream();
            bIut = new BufferedInputStream(inputStream);

            int data;
            while ((data = bIut.read())!= -1){
                fOut.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("The file "+ args[0]+ " has download successfully as "+"song.mp3");
            try {
                bIut.close();
                fOut.flush();
                fOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
