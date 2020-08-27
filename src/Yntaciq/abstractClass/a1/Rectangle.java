package Yntaciq.abstractClass.a1;

public class Rectangle extends Figure {
    Rectangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println(" area of rectagle");
        return dim1 * dim2;
    }
}
