package Yntaciq.trowstrycatch.yourexc;

public class TestNonIntReedultExc {
    public static void main(String[] args) {
        int[] num = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] dum = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < num.length; i++) {
            try {
                if (num[i] % 2 != 0) {
                    throw new NonIntReesultException(num[i], dum[i]);
                }
                System.out.println(num[i] + "/" + dum[i] + "=" + num[i] / dum[i]);

            } catch (ArithmeticException exc) {
                System.out.println("By zero");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Array index out ");
            } catch (NonIntReesultException exc) {
                System.out.println(exc);
            }
        }
    }
}
