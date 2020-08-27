package auditorium.lesson8;

public class   EnumDemo {

    public static void main(String[] args) {

        System.out.println(Week.SATURDAY);
        System.out.println(Week.SATURDAY.name());
        System.out.println(Week.SATURDAY.ordinal());

        System.out.println(Week.valueOf("SATURDAY"));
        System.out.println(Week.valueOf("sdfsdfsdf"));

        Week[] values = Week.values();

    }

}
//
//class Week {
//
//    public static final Week monday = new Week("monday", 1);
//    public static final Week sunday = new Week("sunday", 7);
//
//    private String name;
//    private int numberOfDay;
//
//    private Week(String name, int numberOfDay) {
//        this.name = name;
//        this.numberOfDay = numberOfDay;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getNumberOfDay() {
//        return numberOfDay;
//    }
//
//    public void setNumberOfDay(int numberOfDay) {
//        this.numberOfDay = numberOfDay;
//    }
//}


enum Week {
    MONDAY(1),
    SATURDAY(6),
    SUNDAY(7);

    private int numberOfDay;

    Week(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public boolean isFreeDay() {
        return true;
    }

}