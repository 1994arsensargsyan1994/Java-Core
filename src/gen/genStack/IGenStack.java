package gen.genStack;

import stackutill.StackEmptyException;
import stackutill.StackFullException;

public interface IGenStack <T> {
    void  push(T obj) throws StackFullException;
    T pop() throws StackEmptyException;
}
