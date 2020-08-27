package weobjectdynamic;

public class DynamicObject {
    private Object[] storage;
    private int size;
    private final int CAPACITY;

    public DynamicObject(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.storage = new Object[CAPACITY];
        this.size = 0;
    }

    private void growSize() {
        int length = storage.length;
        Object[] temp = new Object[length * 3 / 2 + 1];
        System.arraycopy(storage, 0, temp, 0, length);
        storage = temp;
    }

    public void add(Object val) {
        if (size == storage.length - 1) {
            growSize();
        }
        storage[size++] = val;
    }

    public Object get(int index) {

  return storage[index];
    }
   int getSize(){
        return size;
   }
   public  <T> T castInsans(Object o) {
       if (o != null) {
           T t = (T) o;
           return t;
       }
       return  null;
   }

}
