package patternBuilder.pattern1;

public class Pattern {
    public static void main(String[] args) {
   Director director = new Director();
   director.setCarBuilder(new FordBuilder());
   Car car = director.Builder();
        System.out.println(car);
    }

}

enum Transmission{
    MANUAL,AUTO
}

class Car {
    private String make;
    Transmission transmission;
    int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void setMake(String make) { this.make = make; }

    public void setTransmission(Transmission transmission) { this.transmission = transmission; }

    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
}

 abstract  class  CarBuilder{
    Car car;
    void create(){ car = new Car();}
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();
    Car getCar() {return  car;}

}
class FordBuilder extends CarBuilder{
    @Override
    void buildMake() { car.setMake("Ford"); }

    @Override
    void buildTransmission() { car.setTransmission(Transmission.AUTO); }

    @Override
    void buildMaxSpeed() { car.setMaxSpeed(200); }
}
class SubaruBuilder extends CarBuilder{
    @Override
    void buildMake() { car.setMake("Subaru"); }

    @Override
    void buildTransmission() { car.setTransmission(Transmission.MANUAL); }

    @Override
    void buildMaxSpeed() { car.setMaxSpeed(180); }
}
class Director{
    CarBuilder carBuilder;
    void setCarBuilder(CarBuilder b){
        carBuilder = b;
    }
    Car Builder(){
        carBuilder.create();
        carBuilder.buildMake();
        carBuilder.buildMaxSpeed();
        carBuilder.buildTransmission();
        Car car = carBuilder.getCar();
        return car;
    }
}
