package Test.testsix;

public class CricketIsDivine {
    public static void main(String[] args) {
        int i = 0;
        for (i = 5;  i <20 ; i+=5) {
            System.out.print(CricketingGods.lookup(i)+"*");
        }
        i = (i / 9)* 9;
        while (i < 100){
            i +=9;
            if (CricketingGods.lookup(i) != null){
                System.out.print(CricketingGods.lookup(i)+ "#");
            }
        }
    }
}
enum CricketingGods{
    Sachin(99),Dravid(15),Dhoni(10),Kohli(5),Raina(27),Ganguly(54);
    int jersey;
    CricketingGods(int jersey){
        this.jersey = jersey;
    }
    static CricketingGods lookup(int jersey){
        for (CricketingGods god:values()) {
            if (god.jersey == jersey){
                god.jersey++;
                return  god;
            }
        }
        return  null;
    }
}
