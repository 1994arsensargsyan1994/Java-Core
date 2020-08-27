package annotacia;
@Deprecated
public class MyClass {
private String msg;

    public MyClass(String msg) {
        this.msg = msg;
    }
   @Deprecated
    public String getMsg() {
        return msg;
    }
}
