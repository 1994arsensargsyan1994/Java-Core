package charspatok;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        int i = 10;
      double d = 123.65;
      pw.println("us PrintWriter class");
      pw.println(i);
      pw.println(d);
      pw.println(i + "+ "+ d +"= " +  (i + d));
    }
}
