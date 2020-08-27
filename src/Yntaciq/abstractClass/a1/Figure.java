package Yntaciq.abstractClass.a1;

abstract class Figure {
    protected double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}
