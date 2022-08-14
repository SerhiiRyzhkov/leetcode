package leet290;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] array = s.split(" ");
        if (array.length != pattern.length()) return false;
        boolean result = true;
        Map<String, Character> map = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) map.put(array[i], pattern.charAt(i));
            if (map.get(array[i]) != pattern.charAt(i)) {
                result = false;
                break;
            }

            if (!map2.containsKey(pattern.charAt(i))) map2.put(pattern.charAt(i), array[i]);
            if (!map2.get(pattern.charAt(i)).equals(array[i])) {
                result = false;
                break;
            }
}


        return result;
    }
}
