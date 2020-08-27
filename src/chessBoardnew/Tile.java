package chessBoardnew;

public class Tile {
    protected boolean empty;
    protected Piece piece;
    protected int x;
    protected int y;

    public Tile() {
    }

    public Tile(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public Tile(boolean empty, int x, int y) {
        this(x,y);
        this.empty = empty;
    }


    public Tile(boolean empty, Piece piece, int x, int y) {
        this(x,y);
        this.empty = empty;
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY1(int y) {
        this.y = y;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isEmpty() {
        return (empty);
    }
}
