package inerAndNestClass.ananimniClass.ex4;

public interface InterFace2 {
    void method();
    int getValue();
}
class Main{
    public static void main(String[] args) {
        InterFace2 interFace1= new InterFace2() {
            int field = 0;
            @Override
            public void method() {
             field = 100;
            }
            @Override
            public int getValue(){
                return  field;
            }
        };
        InterFace2 interFace2 = new InterFace2() {
            int field = -1;
            @Override
            public void method() {
                field = interFace1.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };
        interFace1.method();
        interFace2.method();
        System.out.println("interface1 : "+ interFace1.getValue()+" interface2 : "+ interFace2.getValue());
    }
}
