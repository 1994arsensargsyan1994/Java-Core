package Yntaciq.robotclass;

public class RobotExt  extends  Robot{

  RobotExt(double x ,double y,double course){
      super(x, y);
     this.setCourse(course);         // ete course lini privati poxaren protected (aysinq bac lini jaragman jamanak)
                                     // this.setCourse(course);    poxaren karox e linel this.course;
    }

    public void back(int distance){
      forward(-distance);
    }
}
