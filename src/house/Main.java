package house;

public class Main {
    public static void main(String[] args) {
  House house1 = new House("AB1879",5,25,125.5);
  House house2 = new House("JC548",3,25,110.5);
  House house3 = new House("C457789",5,30,110.5);
  House house4 = new House("AC1254",6,10,135.5);
  House house5 = new House("O1B2547C",2,25,12.5);
  House house6 = new House("ZBC25",6,27,110.5);
  House house7 = new House("ZBA2578",5,31,110.5);
  House [] houses;
  houses = House.getRooms(5);
        for (int i = 0; i <houses.length ; i++) {
            System.out.println(houses[i].toString());
        }
        System.out.println("________________________________________________");
        houses = House.getRoomsAndFlor(5,25,30);
        for (int i = 0; i <houses.length ; i++) {
            System.out.println(houses[i].toString());
        }
        System.out.println("______________________________________________________");
        houses =House.getAreaa(120);
        for (int i = 0; i <houses.length ; i++) {
            System.out.println(houses[i].toString());
        }
        System.out.println("_________________________________________________");
        House.getIdAlphabet();
        System.out.println((int)('A'));
        System.out.println((int)('Z'));
    }
}
