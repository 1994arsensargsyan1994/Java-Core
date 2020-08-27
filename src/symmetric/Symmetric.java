package symmetric;

public class Symmetric {
    public static void main(String[] args) {

        System.out.println("isSymetric(23432) = " + isSymetric(23430));
    }

    public static boolean symmetric(int a) {
        if (a <= 9 && a > 0) {
            return true;
        }
        String text = String.valueOf(a);
        String textTemp = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            textTemp = textTemp + text.charAt(i);
        }
        if (text.equals(textTemp)) {
            return true;
        }
        return false;
    }

    public static boolean isSymetric(int a) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(a));
            return a == Integer.parseInt(sb.reverse().toString());
        } catch (NumberFormatException e) {
            System.out.println("e = " + e.getMessage());
            return false;
        }
    }

}


