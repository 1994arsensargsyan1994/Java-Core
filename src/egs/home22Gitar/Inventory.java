package egs.home22Gitar;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> searchGuitar(GuitarSpec searchGuitar) {
        if (searchGuitar == null) {
            return null;
        }
        List<Guitar> mathGuitar = new LinkedList<>();
        for (Guitar guitar : guitars) {
            if (guitar.getGuitarSpec().match(searchGuitar)) {
                mathGuitar.add(guitar);
            }
        }
        return mathGuitar;
    }
}
