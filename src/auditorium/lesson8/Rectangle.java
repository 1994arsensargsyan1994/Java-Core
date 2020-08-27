package auditorium.lesson8;

public class Rectangle extends Figure {



    public Rectangle() {
        super(0, 0, 10, 10);
    }

    public Rectangle(int x, int y, int width, int length) {
        super(x, y, width, length);
    }

    @Override
    public int getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
