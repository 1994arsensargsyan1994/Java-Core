package gen.genStack;

import stackutill.StackEmptyException;
import stackutill.StackFullException;

public class GenStack<T> implements IGenStack<T> {
    private T[] stack;
    private int tos;

    public GenStack(T[] stack) {
        this.stack = stack;
        tos = 0;
    }
public  GenStack(T[]stack,GenStack<T> o){
        tos = o.tos;
        this.stack = stack;
        try {
            if (stack.length < o.stack.length){
                throw  new StackFullException(stack.length);
            }
        }catch (StackFullException ex){
            System.out.println(ex);
        }
    for (int i = 0; i <tos ; i++) {
        stack[i] = o.stack[i];
    }
}
public GenStack(T[]stack,T[]a){
        this.stack = stack;
    for (int i = 0; i < a.length; i++) {
        try {
           push(a[i]);
        }catch (StackFullException ex){
            System.out.println(ex);
        }
    }
}

    @Override
    public void push(T obj) throws StackFullException {
      if (tos == stack.length){
          throw  new StackFullException(stack.length);
      }
      stack[tos++] = obj;
    }

    @Override
    public T pop() throws StackEmptyException {
  if (tos ==0){
      throw  new StackEmptyException();
  }
  return  stack[--tos];
    }

}
