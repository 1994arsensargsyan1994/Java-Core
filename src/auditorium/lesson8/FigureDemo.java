package auditorium.lesson8;

public class FigureDemo {

    public static void main(String[] args) {

        Figure figure = new Figure(0, 0, 0 ,0) {
            @Override
            public int getPerimeter() {
                return 0;
            }
            @Override
            public double getArea() {
                return 0;
            }
        };

        System.out.println(figure.getClass().getName());

        Figure r = new Rectangle();
        Figure s = new Square(0, 0, 10);

        System.out.println(r.getPerimeter());
        System.out.println(s.getPerimeter());

    }

}
