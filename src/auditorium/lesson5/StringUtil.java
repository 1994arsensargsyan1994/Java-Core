package auditorium.lesson5;

public class StringUtil {

    static void print(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        String text = "  Home   about   Contact Us   ";
        String[] res = split(text);
        print(res);

//        String s = "kuku";
//        String s1 = s;
//        String s1 = "kuku";
//        String s1 = new String("kuku");
//        System.out.println(s == s1);
//        System.out.println(s.equals(s1));
//        s1 = s1 + " bla";
//        System.out.println(s == s1);
    }

    private static String[] split(String text) {
        // goes validation
        int length = text.length() / 2 + text.length() % 2;
        String[] result = new String[length];
        char space = ' ';
        StringBuilder builder = new StringBuilder();
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == space) {
                if (builder.length() != 0) {
                    result[index++] = builder.toString();
                    builder = new StringBuilder();
                }
                continue;
            }
            builder.append(text.charAt(i));
        }
        if (builder.length() != 0) {
            result[index++] = builder.toString();
        }
        String[] res = new String[index];
        System.arraycopy(result, 0, res, 0, index);
        return res;
    }

}
