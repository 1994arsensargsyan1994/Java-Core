package chessBoardnew;

public class Rook extends  Piece {
    public Rook() {
    }

    public Rook(Color color, int x1, int y1) {
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
        if ((endTile.isEmpty() &&
                (endTile.getY() == startTile.getY() || endTile.getX() == startTile.getX()) &&
                (isXRowEmpty(startTile, endTile) || isYRowEmpty(startTile, endTile))) ||
                !(endTile.isEmpty()) && !(endTile.getPiece().getColor().equals(startTile.getPiece().getColor())) &&
                        (endTile.getY() == startTile.getY() || endTile.getX() == startTile.getX()) &&
                        (isXRowEmpty(startTile, endTile) || isYRowEmpty(startTile, endTile))) {
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

    public static boolean isXRowEmpty(Tile tile1, Tile tile2) {
        for (int i = tile1.getX() + 1; i < tile2.getX(); i++) {
            if (!Board.tiles[i][tile1.getY()].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isYRowEmpty(Tile tile1, Tile tile2) {
        for (int i = tile1.getY() + 1; i < tile2.getY(); i++) {
            if (!Board.tiles[tile1.getX()][i].isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
