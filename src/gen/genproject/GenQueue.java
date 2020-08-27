package gen.genproject;

public class GenQueue<T> implements  IGenQ<T> {
    T[] array;
   private int putLoc, getLoc ;

    public GenQueue(T[] array) {
        this.array = array;
         putLoc = getLoc = 0;
    }

    @Override
    public void put(T o) throws QueueFullException1 {
   if (putLoc == array.length-1){
       throw new QueueFullException1(array.length);
   }
   array[putLoc++] = o;
    }

    @Override
    public T get() throws QueueEmptyException1 {
      if (putLoc == getLoc){
          throw  new QueueEmptyException1();
      }
      return array[getLoc++];
    }
}
