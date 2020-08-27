package chess;

public class Player {
    private EnumColor color;
    private Board board = Board.getBoard();
    Player(EnumColor color) {
        this.color = color;
    }
    boolean move(byte firstNumber, byte firstLetter, byte secondNumber, byte secondLetter) {
        try {
                boolean firstCoordinate = checkFirstCoordinate(firstNumber, firstLetter);
                boolean playersFigure = checkPlayersFigure(firstNumber, firstLetter);
                boolean secondCoordinate = checkSecondCoordinate(firstNumber, firstLetter, secondNumber, secondLetter);
            return (firstCoordinate && playersFigure && secondCoordinate);
        }
        catch (Exception e) {
            return false;
        }
    }

    private boolean checkFirstCoordinate(byte firstNumber, byte firstLetter) {
        try {
            if (board.getCell()[firstNumber - 49][firstLetter - 65].getFigure() == null) {
                System.out.println("No figure in that coordinates! \n Please input correct coordinates!");
                return false;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No that coordinates in chess board! \n Please input correct coordinates!");
            return false;
        }
        return true;
    }

    private boolean checkPlayersFigure(byte firstNumber, byte firstLetter) {
        try {
            if (this.color.compareTo(board.getCell()[firstNumber - 49][firstLetter - 65].getFigure().getColor()) != 0) {
                System.out.println("That is not your figure! \n Please input correct coordinates!");
                return false;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No that coordinates in chess board! \n Please input correct coordinates!");
        }
        return true;
    }

    private boolean checkSecondCoordinate(byte firstNumber, byte firstLetter, byte secondNumber, byte secondLetter) {
        Figure <?> firstFigure = board.getCell()[firstNumber - 49][firstLetter - 65].getFigure();
        Figure <?> secondFigure = board.getCell()[secondNumber - 49][secondLetter - 65].getFigure();
        Cell firstCell = board.getCell()[firstNumber - 49][firstLetter - 65];
        Cell secondCell = board.getCell()[secondNumber - 49][secondLetter - 65];
        if (firstFigure instanceof Soldier) {
            int countGame = ((Soldier) firstFigure).getCountGame();
            if(firstFigure.getColor().compareTo(EnumColor.WHITE) == 0) {
                if (countGame == -1 || countGame == 0) {
                    if(countGame == 0 && (firstLetter == secondLetter) && (secondNumber - firstNumber) == 2) {
                        if (((secondCell.getFigure() == null) || (secondCell.getFigure().getColor().compareTo(EnumColor.BLACK) == 0)) && (board.getCell()[secondNumber - 50][secondLetter - 65].getFigure() == null)) {
                            ((Soldier)firstFigure).setCountGame(-1);
                            secondCell.setFigure(firstFigure);
                            firstCell.setFigure(null);
                            return true;
                        } else {
                            System.out.println("Second coordinates are not correct!\n There are your figure!");
                            return false;
                        }
                    }
                    else if ((firstLetter == secondLetter) && ((secondNumber - firstNumber) == 1) && ((secondFigure == null) || (secondFigure.getColor().compareTo(EnumColor.BLACK) == 0))) {
                        if (firstFigure.getColor().compareTo(this.color) == 0) {
                            if(countGame == 0) {
                                ((Soldier) firstFigure).setCountGame(-1);
                            }
                            secondCell.setFigure(firstFigure);
                            firstCell.setFigure(null);
                            return true;

                        } else {
                            System.out.println("Second coordinates are not correct!\n There are your figure!");
                            return false;
                        }
                    }
                    else if (((secondLetter - firstLetter == 1) || (firstLetter - secondLetter ==1)) && ((secondNumber - firstNumber) == 1) && (secondFigure.getColor().compareTo(EnumColor.BLACK) == 0)) {
                        if (firstFigure.getColor().compareTo(this.color) == 0) {
                            if(countGame == 0) {
                                ((Soldier) firstFigure).setCountGame(-1);
                            }
                            secondCell.setFigure(firstFigure);
                            firstCell.setFigure(null);
                            return true;
                        } else {
                            System.out.println("Second coordinates are not correct!\n There are your figure!");
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }

            if(firstFigure.getColor().compareTo(EnumColor.BLACK) == 0) {
                if (countGame == -1 || countGame == 0) {
                    if(countGame == 0 && (firstLetter == secondLetter) && (firstNumber - secondNumber) == 2) {
                        if (((secondCell.getFigure() == null) || (secondCell.getFigure().getColor().compareTo(EnumColor.WHITE) == 0)) && (board.getCell()[secondNumber - 48][secondLetter - 65].getFigure() == null)) {
                            ((Soldier)firstFigure).setCountGame(-1);
                            secondCell.setFigure(firstFigure);
                            firstCell.setFigure(null);
                            return true;
                        } else {
                            System.out.println("Second coordinates are not correct!\n There are your figure!");
                            return false;
                        }
                    }
                    else if ((firstLetter == secondLetter) && ((firstNumber - secondNumber) == 1) && ((secondFigure == null) || (secondFigure.getColor().compareTo(EnumColor.WHITE) == 0))) {
                        if (firstFigure.getColor().compareTo(this.color) == 0) {
                            if(countGame == 0) {
                                ((Soldier) firstFigure).setCountGame(-1);
                            }
                            secondCell.setFigure(firstFigure);
                            firstCell.setFigure(null);
                            return true;
                        } else {
                            System.out.println("Second coordinates are not correct!\n There are your figure!");
                            return false;
                        }
                    }
                    else if (((secondLetter - firstLetter == 1) || (firstLetter - secondLetter ==1)) && ((firstNumber - secondNumber) == 1) && (secondFigure.getColor().compareTo(EnumColor.WHITE) == 0)) {
                        if (firstFigure.getColor().compareTo(this.color) == 0) {
                            if(countGame == 0) {
                                ((Soldier) firstFigure).setCountGame(-1);
                            }
                            secondCell.setFigure(firstFigure);
                            firstCell.setFigure(null);
                            return true;
                        } else {
                            System.out.println("Second coordinates are not correct!\n There are your figure!");
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public EnumColor getColor() {
        return color;
    }
}
