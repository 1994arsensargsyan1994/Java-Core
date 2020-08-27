package Yntaciq.figure;

 class FindeArea {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;
        figref = f;
        System.out.println(" Makersy Figure = : "+ f.area());
        figref = r;
        System.out.println(" Makersy  Ractangle = : "+ r.area());
        figref = t;
        System.out.println(" Makersy  Triangle = : "+ t.area());
    }
}
