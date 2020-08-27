package Yntaciq.trowstrycatch.yourexc;

public class NonIntReesultException extends Exception {
    int a, b;

    NonIntReesultException(int a, int b) {
        this.a = a;
        this.b = b;
    }
public NonIntReesultException(){}

    @Override
    public String toString() {
        return "Результат операции " + a + " / " + b +
                " не является целым числом";
    }
}
