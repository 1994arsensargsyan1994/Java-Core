package Yntaciq;
class  Box{
    double width;
    double heigth;
    double depth;
    Box(Box ob){
        width = ob.width;
        heigth= ob.heigth;
        depth = ob.depth;
    }
    Box(double w,double h,double d){
        width = w;
        heigth = h;
        depth = d;
    }
    Box(){
        width = -1;
        heigth = -1;
        depth = -1;
    }
    Box(double leb)
    {
        width = heigth = depth = leb;
    }
    double volume(){
        return  width * heigth * depth;
    }
}

public class OverLoadBox {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        Box myclone = new Box(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("MyBox 1 = "+ vol);
        vol = myBox2.volume();
        System.out.println("MyBox 2 = "+ vol);
        vol = myCube.volume();
        System.out.println("My Cube   = "+ vol);
        vol = myclone.volume();
        System.out.println("MyClone = "+ vol);

    }

}
