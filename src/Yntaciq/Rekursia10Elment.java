package Yntaciq;
class RecTest{
    int [] value;
    RecTest(int i ){
        value = new int [i];
    }
    void printArray(int i){
        if (i == 0)
            return;
        else
            printArray(i -1);
        System.out.println("["+(i-1)+"]"+value[i-1]);
    }
}
public class Rekursia10Elment {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for ( i = 0; i < 10; i++) {
            ob.value[i] = i;

        }
        ob.printArray(10);
    }
}
