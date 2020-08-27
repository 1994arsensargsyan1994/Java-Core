package arsensargsyan.a1;

public class NewString {
    public static void main(String[] args) {
        String text = "   Barev j il op eerrr   ";
        String[]array = split(text);
        print(array);

    }
    public  static  void  print(String[] array){
        for (String a :array) {
            System.out.print(a+ " ");
        }
    }
    public  static  String[] split(String text){
        int length = text.length() / 2 +1;
        String []result = new String [length];
        char space = ' ';
        StringBuilder builder = new StringBuilder();
        int index = 0;
        for (int i = 0; i <text.length() ; i++) {
            if (text.charAt(i) == space) {
                if (builder.length() != 0) {
                    result[index++] = builder.toString();
                    builder = new StringBuilder();
                }
                continue;
            }
                builder.append(text.charAt(i));
        }
        if (builder.length() != 0 ) {
            result[index++] = builder.toString();
        }
        String []res = new String [index];
        System.arraycopy(result,0,res,0,index);
        return  res;
    }
}
