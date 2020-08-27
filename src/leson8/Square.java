package leson8;

public class Square extends  Rectangle {
    public Square(int x, int y, int size) {
        super(x, y, size,size);
    }
    @Override
    public void setLength(int size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public void setWidth(int size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public int perimeter() {
        return 4 * this.width;
    }
}
