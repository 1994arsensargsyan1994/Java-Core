package stackutill;

import sargsyanarsen.DynamicArray;

public class NewStack {
 private int storage [];
 private int tos;
 private static  final  int DEFAULT = 16;
 public NewStack(){
     storage = new int[DEFAULT];
 }
 public NewStack(int capacity){
     storage = new int [capacity];
     this.tos = -1;
 }
 void push(int value) throws StackFullException {
     if (tos == storage.length-1) {
//         growSize();
         throw new StackFullException(storage.length);
     }
         this.storage[++tos] = value;
     }
 int pop() throws StackEmptyException{
     if (tos == 0){
//         System.err.println("Stack is empty");
         throw  new StackEmptyException();
//         return  -1;
     }
    return storage[tos--];
 }
    private   void growSize(){
        int [] temp = new int [storage.length + (storage.length / 2)];
        System.arraycopy(storage, 0, temp, 0, tos);
        storage = temp;
    }
 }
