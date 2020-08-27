package Yntaciq.lesoons7;
public class DynamicArrayObj implements PrintArray{
        private Object[] storage;
        private int size = 0;
        private static  final  int CAPACITY = 16;
        public DynamicArrayObj(){

            this.storage = new Object[CAPACITY];
        }
        DynamicArrayObj(int value) {
            if (value > 0)
                storage = new Object[value];
        }
        public int size() {
            return size;

        }
        public boolean isEmpty() {

            return size <= 0;
        }

        public boolean contains(Object val) {
            boolean isFalse = false;                 // karoxenq nayev sranov anel
            for (int i = 0; i <size ; i++) {
                if (storage[i] == val){
                    isFalse = true;

                }
            }
            return isFalse;
        }

        // returns the element by specified index
        public Object get(int index) {
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
        public void set(int index, Object val) {
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
        public void add(Object element) {
            if (size == storage.length){
                growSize();
            }
            storage[size++] = element;
        }


        /**
         * adds the element at the specified position in this DynamicArray .
         * Shifts any subsequent elements to the right
         */
        public void add(int index, Object element) {
            if (size == storage.length){
                growSize();
            }
            for (int i =size; i >= index; i--) {
                storage[i + 1] = storage[i];
            }
            size++;
            storage[index] = element;

        }

        public void remove(int index) {
            for (int i = index; i <size-1; i++) {
                storage[i] = storage[i+1];
            }
            size--;
        }
        public   void growSize(){
            Object[] temp = new Object[storage.length + (storage.length / 2)];
            System.arraycopy(storage, 0, temp, 0, size);
            storage = temp;
        }

    @Override
    public void print() {
        for (int i = 0; i <size ; i++) {
            System.out.print(storage[i] + " ");

        }
        System.out.println();
    }
}
