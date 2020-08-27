package gen.genproject;

public interface IGenQ <T>{
    void put(T o) throws QueueFullException1;
    T get() throws QueueEmptyException1;;
}
