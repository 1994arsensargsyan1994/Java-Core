package egs.home;

public interface Animal {
    public  default String getName(){
        return  null;
    }
}
interface  Mammal{
    public   String getName();
}
abstract class Otter implements Mammal,Animal{

    @Override
    public String getName() {
        return null;
    }
}
