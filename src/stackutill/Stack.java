package stackutill;

import sargsyanarsen.DynamicArray;

public class Stack {
    private  int [] array;
    private  int[] tmp;
    private int index = 0;
     Stack(){
        array = new int[5];
    }
    Stack(int a){
         array = new int[a];
    }
    void push (int a){
         if (index < array.length){
             array[index++] = a;
         }else {
             tmp = new int[array.length + (array.length / 2)];

             for (int i = 0; i < index; i++) {
                 tmp[i] = array[i];
             }
             array = new int[tmp.length];
             for (int i = 0; i < index; i++) {
                 array[i] = tmp[i];
             }
//             DynamicArray instans = new DynamicArray();
//             instans.growSize();
             array[index++] = a;
         }
    }
    int pop(){
         if (index > 0){
             return  array[--index];
         }else  {
             System.out.println(" Stack is empty");
             return 0;
         }
    }

}
