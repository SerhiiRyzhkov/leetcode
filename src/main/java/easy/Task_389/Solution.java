package easy.Task_389;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Find the Difference
// https://leetcode.com/problems/find-the-difference/description/
public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> tMap = getMap(t);
        Map<Character, Integer> sMap = getMap(s);

        for(Map.Entry<Character,Integer> m : tMap.entrySet())
            if((!sMap.containsKey(m.getKey()))||(!sMap.get(m.getKey()).equals(tMap.get(m.getKey()))))return m.getKey();

        return t.charAt(0);
    }

    private Map<Character,Integer> getMap(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
            map.put(str.charAt(i),map.containsKey(str.charAt(i))?map.get(str.charAt(i))+1:1);

        return map;
    }
}