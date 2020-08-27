package homework12;

import java.util.*;

public class Demo {
    public static Map<String, String> getCommonElement(Map<String, String> first, Map<String, String> second) {
        Map<String, String> map = new HashMap<>();
        Set<String> strings = first.keySet();
        Set<String> strings1 = second.keySet();
        for (String s : strings) {
            for (String s1 : strings1) {
                if (s.equals(s1)) {
                    map.put(s1, map.get(s1));
                }
            }
        }

        return map;
    }

    public static Map<String, String> getCommonElementAndValue(Map<String, String> first, Map<String, String> second) {
        Map<String, String> map = new HashMap<>();
        Set<String> strings = first.keySet();
        Set<String> strings1 = second.keySet();
        for (String s : strings) {
            for (String s1 : strings1) {
                if (s.equals(s1)) {
                    if (first.get(s).equals(second.get(s1))) {
                        map.put(s1, map.get(s1));
                    }

                }
            }
        }

        return map;

    }

    public static Map<String, String> getUniqueElements(Map<String, String> first, Map<String, String> second) {
        Map<String, String> map = new HashMap<>();
        Set<String> oan = first.keySet();
        Set<String> tow = second.keySet();
        if (Collections.disjoint(oan, tow)) {// this method test.. oan and tow map if they do not contain the same elements
            map.putAll(first);
            map.putAll(second);                                 // return true else fouls
            return map;
        } else {
            for (String s : oan) {
                for (String s1 : tow) {
                    if (!first.containsKey(s1)) {
                        map.put(s1, second.get(s1));
                    }
                    if (!second.containsKey(s)) {
                        map.put(s, first.get(s1));
                    }
                }
            }
        }
        return map;
    }

    public static Map<String, String> getAllElements(Map<String, String> first, Map<String, String> second) {
        Map<String, String> map = new HashMap<>();
        Set<String> oan = first.keySet();
        Set<String> tow = second.keySet();
        map.putAll(first);
        for (String s : tow) {
            if (!first.containsKey(s)){
                map.put(s,second.get(s));
            }
        }
        return map;
    }
    }
