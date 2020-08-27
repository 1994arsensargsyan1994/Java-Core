package tester;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
        public static void main(String args[]) {
            if( "Welcome".trim() == "Welcome".trim())
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
            System.exit(0);
            Test test1 = new Test();
            System.out.println(test1.xyz(15));
            int i=0, j=2;
            do {
                i=++i;
                j--;
            } while(j>0);
            System.out.println(i);
            int[] arr = {1,2,3,4};
            call_array(arr[0], arr);
            System.out.println(arr[0] + "," + arr[1]);
           ArrayList<String> l = new ArrayList<>();
           l.add("A");
           l.add("B");
            List<ArrayList> lists = new ArrayList<>();
            lists.add(l);
            System.out.println(lists.get(0).get(1));

        }
    static void call_array(int i, int arr[])
    {
        arr[i] = 6;
        i = 5;
    }
    public int xyz(int num) {
            if(num == 1) return 1;
            else return(xyz(num-1) + num);
        }
    }
interface A{
    private String A(){
        return "jk";
    }


}

