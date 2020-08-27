package streamAPI.map;

import java.util.ArrayList;
import java.util.stream.Stream;

public class NamePhoneEmail {
    String name;
    String phoneNum;
    String email;

    public NamePhoneEmail(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
}
class NamePhone{
    String name;
    String phoneNum;

    public NamePhone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
}
class StreamDemo5{
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Arsen","555-555","1994arsensargsyan@gmail.com"));
        list.add(new NamePhoneEmail("Vardan","658-555","VardanMail@gmail.com"));
        list.add(new NamePhoneEmail("Vanine","688-565","987lopi@gmail.com"));
        System.out.println("inital list ");
        list.stream().forEach((x)-> {
            System.out.println(x.name + " "+x.phoneNum + " "+ x.email);
        });
        Stream<NamePhone> nameAndPhone = list.stream().map((a)->new NamePhone(a.name,a.phoneNum));
        System.out.println("list for name and phoneNum ");
        nameAndPhone.forEach((x)->{
            System.out.println(x.name+ " "+ x.phoneNum);
        });

    }

}

