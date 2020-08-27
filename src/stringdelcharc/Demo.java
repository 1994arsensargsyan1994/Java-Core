package stringdelcharc;

public class Demo {
    public static void main(String[] args) {
   String s = "abcdb";
   String str = removeChar(s,'b');
        System.out.println(str);
    }
    public  static String removeChar(String s,char c){
        return  s == null ? null : s.replaceAll(Character.toString(c),"");
    }
}
