package egs.home22Gitar;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        GuitarSpec guitarSpec = new GuitarSpec( Builder.FENDER,"VCH124",12, Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("1238-VOL-15", 152.25,guitarSpec);
        inventory.addGuitar("1256-VOL-17",  1752,guitarSpec);
        Guitar guitar = inventory.getGuitar("1238-VOL-15");
        List<Guitar> list = inventory.searchGuitar(guitarSpec);
        if (!list.isEmpty()) {
            for (Guitar duringGuitar : list) {
                GuitarSpec temp = duringGuitar.getGuitarSpec();
                System.out.println(temp.toString());
                System.out.println("_______________________________________________");
            }
        } else {
            System.out.println("not any guitar");
        }
    }

}
