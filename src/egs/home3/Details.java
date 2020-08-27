package egs.home3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Details {
    public static void main(String[] args) {
        String str = "abcddki&&";
        countOfCharDup(str);
    }

    public static void countOfCharDup(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (Character element : charArray) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else
                map.put(element, 0);
        }
        Set<Character> set = map.keySet();
        for (Character element : set) {
            System.out.println("Char " + element + "- " + map.get(element));
        }
    }
}
