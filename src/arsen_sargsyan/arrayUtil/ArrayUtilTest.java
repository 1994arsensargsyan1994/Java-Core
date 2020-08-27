package arsen_sargsyan.arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] array ={8,98,18,13,54,3,59};
        int[] array1 ={12,-24,18,89,111,68,77,86,88,71};
        System.out.println(" MIN number = "+ ArrayUtil.getMinimum(array));
        System.out.println(" MAX number = "+ArrayUtil.getMaximum(array));
        System.out.println(" SUM = "+ArrayUtil.getSum(array));
        ArrayUtil.print(array);
        System.out.println("_____________________________________");
       ArrayUtil.reverse(array);
       ArrayUtil.print(array);
        System.out.println("_____________________________________");
        ArrayUtil.sortByOddAndEven(array);
        ArrayUtil.print(array);
        System.out.println("_____________________________________");
      //  ArrayUtil.sort(array1);
        ArrayUtil.print(array1);


    }
}
