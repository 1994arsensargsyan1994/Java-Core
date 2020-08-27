package Yntaciq.abstractClass.a1;

public class AbstractAreas {
    public static void main(String[] args) {
   // Figure f = new Figure(10,10);     // ay chi kareli kanpilaciai eror qani vor abstract class i hamar obekt chi kareli sarqel
    Rectangle r = new Rectangle(9,5);
    Triangle t = new Triangle(10,8);
    Figure figure ;                        // sa obekt che sa ssilka e
        figure = r;
        System.out.println(" area = Ractangle: "+ figure.area());
        figure = t;
        System.out.println(" area = Triangle: "+ figure.area());

    }
}
