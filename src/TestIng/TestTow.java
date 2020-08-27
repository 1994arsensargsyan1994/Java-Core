package TestIng;

public class TestTow {
    public static void main(String[] args) {
        String s = "42";
        try {
            s = s.concat(".5");
            double d = Double.parseDouble(s);
            s = Double.toString(d);
            int x =(int) Math.ceil(Double.valueOf(s).doubleValue());
            System.out.println(x);
        }catch (NumberFormatException ex){
            System.out.println("Bad number");
        }
    }
}
