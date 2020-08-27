package patternBuilder;

public class Pattern {
    public static void main(String[] args) {
       Car car = new CarBuilder().builderMake("Audi")
               .builderTransmission(Transmission.AUTO).builder();
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

class CarBuilder{
    String m = "default";
    Transmission t = Transmission.AUTO;
    int mS = 120;
     CarBuilder builderMake(String m){
         this.m = m;
         return this;
     }
    CarBuilder builderTransmission(Transmission t){
        this.t = t;
        return this;
    }
    CarBuilder builderMaxSpeed(int mS){
        this.mS = mS;
        return this;
    }
    Car builder(){
         Car car = new Car();
         car.setMake(m);
         car.setTransmission(t);
         car.setMaxSpeed(mS);
         return car;
    }



}
