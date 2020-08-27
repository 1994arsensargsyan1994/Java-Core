package chessBoardnew;

public abstract class Piece {
    protected Color color;
    protected int x1;
    protected int y1;

    public Piece() {
    }

    public Piece(Color color,int x1, int y1) {
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract boolean canMove(Tile startTile, Tile endTile);

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    abstract void move(Tile tile1, Tile tile2);

}
