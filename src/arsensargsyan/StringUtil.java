package arsensargsyan;

import javax.swing.*;

public class StringUtil {

    public static void main(String[] args) {
        System.out.println("|  " + (char) ('1' - 48) + " |");
        System.out.println("|  " + ('1' - 48) + " |");
        System.out.println(parsInt("1234"));
        split("Hello me best friend");
        System.out.println();
        System.out.println( "subStrng : "+ subString("My subString method ",2,6));
        System.out.println("trim : "+trim("    Start    and end space  "));
        System.out.println("calculatrCount : "+calculateCount("kuuk",'k'));
    }

    public static int parsInt(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                JOptionPane.showMessageDialog(null,
                        "Failed to parse string to int: '" + str + '\'');
                return Integer.MIN_VALUE;
            }
            res = res * 10 + ch - '0';
        }

        return res;
    }


    public static String[] split(String text) {
        // you need to declare StringBuilder word = new ....;
        // also declare the String[] wordsList;
        // try to split the text by ' ' white space) into the wordsList
        // return the wordsList

        int k = 0;
        char space= ' ';
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == space){
                 k ++;
            }
        }
        StringBuilder word = new StringBuilder(k+1);
        String[] wordsList = new String[k+1];
        int j = 0;
        int i = 0;
        for ( i = 0; i <text.length() ; i++) {

            if (text.charAt(i) != space){
                word.append(text.charAt(i));
            }
            if (text.charAt(i) == space ){
                wordsList[j] = String.valueOf(word);
                word.setLength(0);
                j++;
            }
        }
        wordsList[j] = String.valueOf(word);

        for (int l = 0; l <wordsList.length ; l++) {
            System.out.print(wordsList[l] + "\t");
        }

        return wordsList;
    }

    public static String trim(String text) {
        // start to iterate by text's symbols, by using "for" loop from the beginning and end
        // until first non  empty space symbol ,
        // store these two indexes into "int start" and "int end" variables
//        write the method: ( public static String subString(String text, int start, int end){}  )
//        which returns the part of specified text from the "start" index until "end"
////        after all return the above mentioned substring
//

        String newString = "";
        int start = 0;
        int end = text.length()-1;
        while (start < end && text.charAt(start) == ' '){
            start ++;
        }
        while (end > start && text.charAt(end) == ' '){
            end--;
        }
        newString = subString(text,start,end);
          text = newString;
        return text;
    }



    public static String subString(String text, int start, int end) {
        String tmp  ="";
        for (int i = start; i < text.length(); i++) {

            tmp += text.charAt(i);
            if (i == end){
                break;
            }

        }
//        returns the part of specified text from the "start" index until "end"
        return tmp;
    }


    public static int calculateCount(String text, char symbol) {
        // int count = 0
        //  iterate by for( ...) {
        //   take the following symbol and che if it equals to specified "symbol" parameter count must be incremented
        // }
        // after all return the count
        int cont = 0;
        for (int i = 0; i <text.length() ; i++) {
            if (text.charAt(i) == symbol){
                cont ++;
            }

        }
        return cont;
    }


}
