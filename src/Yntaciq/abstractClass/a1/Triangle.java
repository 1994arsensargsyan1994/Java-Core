package Yntaciq.abstractClass.a1;

public class Triangle extends  Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println(" Area of Triangle");
        return dim1 * dim2 / 2;
    }
}
