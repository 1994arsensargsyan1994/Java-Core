package lesson10;

public class ArrayList<E> implements List<E> {
    private  int size;
    private Object[] storage;
    public ArrayList() {
        this.size=0;
        this.storage=new Object[List.CAPACITY];

    }
    public ArrayList(int cap){
        this.size = 0;
        this.storage = new Object[cap];
    }

    @Override
    public void add(E element) {

    }

    @Override
    public void add(int index, E element) {

    }

    @SuppressWarnings("all")   // seri veracnel
    @Override
    public E set(int index, E element) {
             if (index > size){
                 throw new IndexOutOfBoundsException("Index could not be more then size.\n"+
                         "Index "+index+" ,Size "+ size);
             }
        if (index < 0){
            throw new IndexOutOfBoundsException("Index could not be negative: "+index);
        }
        E oldElement =(E) storage[index];
        storage[index] = element;
        return oldElement;
    }

    @Override
    public E get(int index) {
return null;
    }

    @Override
    public void removeOfElement(E element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
