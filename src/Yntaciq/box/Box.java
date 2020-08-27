package Yntaciq.box;

public class Box {
    private double width;
    private double height;
    private double depth;
    Box(Box o){
       width= o.width;
       height= o.height;
       depth = o.height;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height =depth = len;
    }
  double volume(){
        return width * height * depth;
  }

}
class  BoxWeight extends Box{
  double weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
BoxWeight(double width ,double height,double depth,double weight){
        super(width,height,depth);
        this.weight = weight;
}
      BoxWeight(){
        super();
        weight = -1;
      }
      BoxWeight(double len,double weight){
        super(len);
        this.weight = weight;
      }
}
class Shipment extends BoxWeight{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }
    Shipment(){
        super();
        cost = -1;
    }
    Shipment(double len,double weight,double cost){
        super(len,weight);
        this.cost = cost;
    }

}
class  DemoShipment{
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Obyom shipment1 " + vol);
        System.out.println("Ves shipment1 " + shipment1.weight);
        System.out.println("stoymst shipment1 : $ " + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Obyom shipment2 " + vol);
        System.out.println("Ves shipment2 " + shipment2.weight);
        System.out.println("stoymst shipment2 : $ " + shipment2.cost);
        System.out.println();
    }
}

