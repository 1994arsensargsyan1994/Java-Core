package Yntaciq.robotclass;

public class Robot {
    private double x = 0;
    private double y = 0;
    private double course = 0;

     Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void forward(int distance){                           // canstrctor krox e chinel public (ete nuyn papkum en ) hetev-ov tesanelutyan princpin
        x = x + distance * Math.cos(course / 18 * Math.PI);
        y = y + distance * Math.cos(course / 18 * Math.PI);
    }
    public void printCoordinates(){
        System.out.println(x + " , "+ y);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}
