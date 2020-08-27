package gen.genInertface;

public class MyClass <T> implements Containment<T>{
    T[] arrayRef;
    public MyClass(T[] o) {
        arrayRef = o;
    }
    @Override
  public boolean contains(T o){
        for (T temp :arrayRef) {
            if (temp.equals(o)){
                return  true;
            }
        }
        return  false;
    }
}
