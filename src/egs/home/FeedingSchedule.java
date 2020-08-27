package egs.home;

public class FeedingSchedule {
    public static void main(String[] args) {
        boolean keepGoing= true;
        int count = 0;
        int x =3;
        while (count++ < 3){
            int y = (1+2 * count)% 3;//1- y = 0 , 2- y = 2, 3- y = 1
            switch (y){
                default:
                case 0: x -= 1; break;// 1 - x = 2, 2 - x = 1
                case 1: x += 5; // 3 - x = 1+5=6
            }
        }
        System.out.println(x);// output 6
    }
}
