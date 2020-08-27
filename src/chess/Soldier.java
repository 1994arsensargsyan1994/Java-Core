
package chess;


public class Soldier extends Figure {
    private int countGame = 0;

    public Soldier(EnumColor color) {

        super(color, "♙");

    }

    public int getCountGame() {
        return countGame;
    }

    public void setCountGame(int countGame) {
        this.countGame = countGame;
    }
}
