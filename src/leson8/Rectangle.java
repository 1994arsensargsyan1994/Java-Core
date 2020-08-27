package leson8;

public class Rectangle extends  Figure {
    public Rectangle(int x, int y, int length, int width) {
        super(x, y, length, width);
    }

    @Override
    public int perimeter() {

        return this.width + this.width + this.length + this.length ; //(this.width + this.length) * 2
    }

    @Override
    public double area() {
        return 0;
    }
}
