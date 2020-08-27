import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("text");
//        Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();
//        String []numbersString = line.split(" ");
//        int[] numbers = new int[3];
//        int count = 0;
//        for (String number:numbersString){
//            numbers[count++] = Integer.parseInt(number);
//        }
//        System.out.println(Arrays.toString(numbers));
        PrintWriter pw = new PrintWriter(file);
        pw.println("it is line 1");
        pw.println("it is line 2");
        pw.close();
    }
}
