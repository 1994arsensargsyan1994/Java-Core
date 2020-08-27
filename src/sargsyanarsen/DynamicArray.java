package sargsyanarsen;


public class DynamicArray {
    private int[] storage;
    private int size = 0;
    private static  final  int CAPACITY = 16;
    public DynamicArray(){

        this.storage = new int[CAPACITY];
    }
    DynamicArray(int value) {
        if (value > 0)
        storage = new int[value];
    }


    //returns count of elements added in to DynamicArray 
    public int size() {
        return size;

    }
    
    //return true if is empty
    public boolean isEmpty() {

        return size <= 0;
    }

    // returns true if the value is exist in the Dynamicarray 
    public boolean contains(int val) {
        boolean isFalse = false;                 // karoxenq nayev sranov anel
        for (int i = 0; i <size ; i++) {
            if (storage[i] == val){
                isFalse = true;

            }
        }
        return isFalse;
    }
    
    // returns the element by specified index 
    public int get(int index) {
        if (index < 0 ){
            System.out.println("Index can not be negative!!!");
            return -1;
        }
        if (index >= size) {
            System.out.println(" Array index out of bounds");
            return -1;
        }
        return storage[index];
    }

    // sets the specified val by the specified index
    public void set(int index, int val) {
        if (index >= 0 || index<= size) {
            System.out.println("Error");
            return;
        }else {
            storage[index] = val;
        }
    }
 
     /**
     * adds the element at the end position in this DynamicArray .
     * 
     */
    public void add(int val) {
          if (size == storage.length){
              growSize();
          }
          storage[size++] = val;
    }


     /**
     * adds the element at the specified position in this DynamicArray .
     * Shifts any subsequent elements to the right 
     */
    public void add(int index, int element) {
       if (size == storage.length){
           growSize();
       }
        for (int i =size; i >= index; i--) {
            storage[i + 1] = storage[i];
        }
        size++;
        storage[index] = element;

    }

     /**
     * Removes the element at the specified position in this DynamicArray .
     * Shifts any subsequent elements to the left      
     */
    public void remove(int index) {
        for (int i = index; i <size-1; i++) {
            storage[i] = storage[i+1];
        }
        size--;
    }
    public   void growSize(){
       int [] temp = new int [storage.length + (storage.length / 2)];
       System.arraycopy(storage, 0, temp, 0, size);
        storage = temp;
    }
  public void print(){
        ArrayUtil.print(storage,size);
  }
    
}
