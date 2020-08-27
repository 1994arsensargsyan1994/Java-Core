package chessBoard.neww;

enum  ColorOfBox {
    BLACK,WHITE;
    String a = ""+ConsoleColors.BLUE;
    @Override
    public String toString() {
        if (this.name().equals("BLACK")){
            return "BLACK";
        }else
            return "WHITE";

    }
}
