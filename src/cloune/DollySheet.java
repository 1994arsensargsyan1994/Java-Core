package cloune;

import animal.Cat;

public class DollySheet implements  Cloneable{
    private  String name;
    private Cat cat = new Cat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
