package auditorium.lesson4.arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int limit = 100;
        int length = 10;
        int [] array = ArrayUtil.generateRandomIntArray(limit, length);
        ArrayUtil.print(array);
        ArrayUtil.sortByOddAndEven(array);
        ArrayUtil.print(array);
    }
}