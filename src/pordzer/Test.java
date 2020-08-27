package pordzer;

public class Test {
   void fillArray(int array[],int value){
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    public static void main(String[] args) {
        int array[] = new int[15];
        Test test = new Test();
        test.fillArray(array,1);
        test.print(array);

    }
    void print(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }

}
