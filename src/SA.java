import java.util.Calendar;
import java.util.Date;

public class SA {
    Integer i;
    int j;

    public SA() {
        i = 5;
        j =10;
    }

    public static void main(String[] args) {
        SA sa = new SA();
        sa.go();
        Calendar calendar = Calendar.getInstance();
        String s = "2";
        s.length();
        int x = Integer.parseInt(s);
        System.out.println(x);
        double  d = 42.5;
        String doubleStr = Double.toString(d);
        System.out.println(doubleStr);
        System.out.println(String.format("%tr", new Date()));
        System.out.println(String.format("%tc", new Date()));
        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td", today,today,today));
        System.out.println(String.format("%tA, %<tB %<td", today));   // < naxki Datanery ogtagorcir karcanelu hamar
        calendar.set(2019,11,21,14,23);
        long day1 = calendar.getTimeInMillis();
        day1 = 1000 * 60 * 60 ;
        calendar.setTimeInMillis(day1);
        System.out.println("Nor jam "+ calendar.get(calendar.HOUR_OF_DAY));
        calendar.add(calendar.DATE,35);
        System.out.println("avlacnel 35 or"+ calendar.getTime());
        calendar.roll(calendar.DATE,35);
        System.out.println("prekrutit 35 dney"+calendar.getTime());
        calendar.set(calendar.DATE,1);
        System.out.println("ustanavim datu 1"+calendar.getTime());
    }
    public  void go(){
        i = j;
        System.out.println(j);
        System.out.println(i);
    }
}
