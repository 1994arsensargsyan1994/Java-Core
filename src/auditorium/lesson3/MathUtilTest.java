package auditorium.lesson3;

public class MathUtilTest {
    public static void main(String[] args) {
        MathUtil.printIntAsBinary(-38);

        int value = MathUtil.reverse(1230);

        System.out.println(value);

        byte day = 3;
        String week = getDayOfWeek(day);

        String text = "The day " + day + " of week is " + week;
        System.out.println(text);

        String word = "Hello aksdghaksg";

        System.out.println(word);

        System.out.println(abs(-789));

    }

    public static String getDayOfWeek(byte dayNumber) {
        String week;
        switch (dayNumber) {
            default:
                week = "It is wrong day of week.";
                break;
            case 1:
                week = "Monday";
                break;
            case 2:
                week = "Tuesday";
                break;
            case 3:
                week = "Wednesday";
                break;
            case 4:
                week = "Thursday";
                break;
            case 5:
                week = "Friday";
                break;
            case 6:
                week = "Saturday";
                break;
            case 7:
                week = "Sunday";
                break;
        }
        return week;
    }

    public static int abs(int number) {
        return number > 0 ? number : -number;
    }

}
