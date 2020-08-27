package gen;

public class NumericFns <T extends Number> {
    T num;

    public NumericFns(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }
        return false;
    }
}
class Demo{
    public static void main(String[] args) {
        NumericFns<Integer> iob = new NumericFns<>(6);
        NumericFns<Double> dob = new NumericFns<>(-6.0);
        NumericFns<Long> lob = new NumericFns<>(5L);
        if (iob.absEqual(dob)){
            System.out.println("iob and dob equal");
        }
        else
        System.out.println("dont");
        if (iob.absEqual(lob)){
            System.out.println("iob and lob equal");
        }
        else
        System.out.println("dont");
    }
}
