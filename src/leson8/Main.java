package leson8;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(0,0,12,16) {
            @Override
            public int perimeter() {
                return 0;
            }

            @Override
            public double area() {
                return 0;
            }

        };
        Figure figure1 = new Rectangle(0,0,10,25);
        Figure figure2= new Square(0,0,10);
        System.out.println(figure1.perimeter());
        System.out.println(figure1.perimeter());
    }
}
