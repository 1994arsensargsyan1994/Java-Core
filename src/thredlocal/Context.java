package thredlocal;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Context {
    private String userName;

    public Context(String userName) {
        this.userName = userName;
    }
}
class SharedMapWithUserContext implements  Runnable{
      Map<Integer,Context> userContextPerUserId = new ConcurrentHashMap<>();
      private Integer useId;
    @Override
    public void run() {

    }
}
