package chess;

import chessBoard.neww.ConsoleColors;

import static chess.EnumColor.WHITE;

public class Board {
    private static Board board = null;
    private   Cell [][] cells = new Cell[8][8];
    private int coordinateNumber [] = {1, 2, 3, 4, 5, 6, 7, 8};
    private char coordinateLetter [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    private Board() {
        initializeCells();
        setCellsColor();
    }
    void showBoard () {
        for (int i = 0; i < 8; i++) {
            System.out.print("\t\t");
            System.out.print(coordinateLetter[i]);

        }

        for (int j = 0; j < 8; j++) {
            System.out.println();
            System.out.println();
            System.out.print(coordinateNumber[j]);
            for (int k = 0; k < 8; k++) {
                Cell temp = cells[j][k];
                if(temp.getFigure() == null) {
                    if (temp.getColor().compareTo(WHITE) == 0) {;
                        System.out.print("\t\t" + ConsoleColors.WHITE_BACKGROUND);
                    } else {
                        System.out.print("\t\t" + ConsoleColors.BLACK_BACKGROUND);
                    }
                } else {
                    if (temp.getFigure().getColor().compareTo(EnumColor.BLACK) == 0) {

                        System.out.print("\t\t" + ConsoleColors.BLACK_BACKGROUND + temp.getFigure().getImage());
                    } else {
                        System.out.print("\t\t" + ConsoleColors.WHITE_BACKGROUND + temp.getFigure().getImage() + '.');
                    }
                }
            }

        }

    }

    public Cell[][] getCell() {
        return cells;
    }

    private void setCellsColor(){
        for (int i = 0; i < 8; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    cells[i][j].setColor(EnumColor.valueOf("BLACK"));
                }
                for (int k = 1; k < 8; k += 2) {
                    cells[i][k].setColor(EnumColor.valueOf("WHITE"));
                }
            } else {
                for (int j = 1; j < 8; j += 2) {
                    cells[i][j].setColor(EnumColor.valueOf("BLACK"));
                }
                for (int k = 0; k < 8; k += 2) {
                    cells[i][k].setColor(EnumColor.valueOf("WHITE"));
                }
            }
        }
    }

   private void initializeCells() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell();
                switch (i) {
                    case 1: {
                            cells[i][j].setFigure(new Soldier(EnumColor.valueOf("WHITE")));
                        break;
                    }
                    case 0:
                        {
                        if(j == 0 || j == 7) {
                            cells[i][j].setFigure(new Boat(EnumColor.valueOf("WHITE")));
                        } else  if(j == 1 || j == 6) {
                            cells[i][j].setFigure(new Horse(EnumColor.valueOf("WHITE")));
                        } else  if(j == 2 || j == 5) {
                            cells[i][j].setFigure(new Elephant(EnumColor.valueOf("WHITE")));
                        } else  if(j == 3) {
                            cells[i][j].setFigure(new Queen(EnumColor.valueOf("WHITE")));
                        } else {
                            cells[i][j].setFigure(new King(EnumColor.valueOf("WHITE")));
                        }
                        break;
                    }
                    case 6: {
                        cells[i][j].setFigure(new Soldier(EnumColor.valueOf("BLACK")));
                        break;
                    }
                    case 7: {
                        if(j == 0 || j == 7) {
                            cells[i][j].setFigure(new Boat(EnumColor.valueOf("BLACK")));
                        } else  if(j == 1 || j == 6) {
                            cells[i][j].setFigure(new Horse(EnumColor.valueOf("BLACK")));
                        } else  if(j == 2 || j == 5) {
                            cells[i][j].setFigure(new Elephant(EnumColor.valueOf("BLACK")));
                        } else  if(j == 3) {
                            cells[i][j].setFigure(new Queen(EnumColor.valueOf("BLACK")));
                        } else {
                            cells[i][j].setFigure(new King(EnumColor.valueOf("BLACK")));
                        }
                        break;
                    }
                }
            }
        }
    }

    public static Board getBoard() {
        if(board == null) {
            board = new Board();
        }
        return board;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
