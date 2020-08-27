package chessBoardnew;

public class Pawn extends  Piece {
    public Pawn() {
    }

    public Pawn(Color color, int x1, int y1) {
        super(color, x1, y1);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    boolean canMove(Tile startTile, Tile endTile) {
        if ((endTile.isEmpty() && endTile.getY() > startTile.getY() && (endTile.getY() - 1) == startTile.getY()) ||
                !(endTile.isEmpty()) && !(endTile.getPiece().getColor().equals(startTile.getPiece().getColor())) &&
                        endTile.getY() > startTile.getY() &&
                        (((endTile.getX() - 1) == startTile.getX()) &&
                                ((endTile.getY() - 1) == startTile.getY()) ||
                                ((endTile.getX() + 1) == startTile.getX()) &&
                                        (endTile.getY() - 1) == startTile.getY())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    void move(Tile tile1, Tile tile2) {
        if (canMove(tile1, tile2)) {
            tile2.setEmpty(false);
            tile2.setPiece(tile1.getPiece());
            tile1.getPiece().setX1(tile2.getX());
            tile1.getPiece().setY1(tile2.getY());
            tile1.setEmpty(true);
            tile1.setPiece(null);
        } else {
            System.out.println("The piece can't move");
        }
    }
}
