package streamAPI.nakaplenia;

import java.util.*;
import java.util.stream.Collectors;
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
class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Arsen", "555-555", "1994arsensargsyan@gmail.com"));
        list.add(new NamePhoneEmail("Vardan", "658-555", "VardanMail@gmail.com"));
        list.add(new NamePhoneEmail("Vanine", "688-565", "987lopi@gmail.com"));
        System.out.println("inital list ");
        list.stream().forEach((x) -> {
            System.out.println(x.name+" "+x.phoneNum+" "+x.email);
        });
        Stream<NamePhone> phoneStream = list.stream().map((x)-> new NamePhone(x.name,x.phoneNum));
        List<NamePhone> npList  = phoneStream.collect(Collectors.toList());
        System.out.println("Имена и номера телефонов в стветипа List : ");
        for (NamePhone a : npList) {
            System.out.println(a.name+" "+ a.phoneNum);
        }
        phoneStream=list.stream().map((x)->new NamePhone(x.name,x.phoneNum));
        Set<NamePhone> setList = phoneStream.collect(Collectors.toSet());
        System.out.println("Имена и номера телефонов в множе стветипа S e t : " ) ;
        for (NamePhone a : setList) {
            System.out.println(a.name+" "+ a.phoneNum);
        }
//        LinkedList<NamePhone> linList = phoneStream.collect(()-> new LinkedList<>(), // equal like under HashSet
//                (list1,element )-> list1.add(element),                               // sa orinak e aytex ka IllegalStateException: stream has already been operated upon or closed
//                (listA,listB)->listA.addAll(listB) );
//        System.out.println();
//        HashSet<NamePhone> hashSet= phoneStream.collect(HashSet::new,           // sa orinak e aytex ka IllegalStateException: stream has already been operated upon or closed
//                                                        HashSet::add,
//                                                       HashSet::addAll);
//        System.out.println("Имена и номера телефонов в множе стветипа HashSet: ");
//        for (NamePhone a : hashSet) {
//            System.out.println(a.name+" "+a.phoneNum);
//        }
    }
}
