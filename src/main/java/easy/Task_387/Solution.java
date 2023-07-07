package easy.Task_387;

import java.util.LinkedHashMap;
import java.util.Map;

// First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);


        for(Map.Entry<Character,Integer> m : map.entrySet())
            if (m.getValue() == 1) return s.indexOf(m.getKey());

        return -1;
    }
}