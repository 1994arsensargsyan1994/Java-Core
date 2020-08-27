package egs.home;

import java.util.ArrayList;
import java.util.List;

public class ChickenSong {

    public static void main(String[] args) {
        HenHouse house = new HenHouse() {
            @Override
            public List<Chicken> getChickens() {
                Chicken chicken = new Chicken();
                Chicken chicken1 = new Chicken();
                Chicken chicken2 = new Chicken();
                Chicken chicken3 = new Chicken();
                java.util.List<Chicken> list = new ArrayList<>();
                list.add(chicken);
                list.add(chicken1);
                list.add(chicken2);
                list.add(chicken3);
                return list;
            }
        };
                Chicken chiken = house.getChickens().get(0);
        for (int i = 0; i <house.getChickens().size(); chiken = house.getChickens().get(i++)) {
            System.out.println("Cluck");

        }
    }
}
interface HenHouse{
    public java.util.List<Chicken> getChickens();
}
class Chicken{}
