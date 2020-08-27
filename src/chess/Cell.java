package chess;

public class Cell {
   private Figure<?> figure;
   private EnumColor color;
   private int number;
   private char letter;



    Figure<?> getFigure() {
        return this.figure;
    }

    EnumColor getColor() {

        return this.color;
    }


    void setFigure(Figure<?> figure) {

        this.figure = figure;
    }

    void setColor(EnumColor color) {

        this.color = color;
    }

    public void setCoordinate(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }


    public int getNumber (){
        return this.number;
    }
    public int getLetter (){
        return this.letter;
    }

    void move(int firstNumber, char firstLetter, int secondNumber, char secondLetter) {

    }


}
