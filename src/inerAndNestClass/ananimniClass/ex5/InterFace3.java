package inerAndNestClass.ananimniClass.ex5;

 public interface InterFace3 {
    void  method();
    int getValue();
}
class ConcreteClass implements InterFace3{
protected  int protectedField = 10;
    @Override
    public void method() {
        System.out.println("ConcreteClass method : ");
    }

    @Override
    public int getValue() {
        return protectedField;
    }
}
 class  Main{
     public static void main(String[] args) {
         ConcreteClass inst1 = new ConcreteClass(){
             @Override
             public void  method(){
                 System.out.println("ins1 method : ");
             }
         };
         InterFace3 inst2 =new  ConcreteClass(){
             int protectedField = 3;
             @Override
             public void method() {
                 System.out.println("inst2 method : ");
             }

             @Override
             public int getValue() {
                 return this.protectedField + super.getValue();
             }
         };
         inst1.method();
         inst2.method();
         System.out.println(" inst protectedField = "+ inst1.protectedField + "  inst protectedField = " + inst2.getValue());
         System.out.println(inst1.getClass().toString());   //   ananimni clasi anuny
         System.out.println(inst2.getClass().toString());    //
     }

}
