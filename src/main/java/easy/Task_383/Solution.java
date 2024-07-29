package easy.Task_383;

import java.util.HashMap;
import java.util.Map;

// Ransom Note
// https://leetcode.com/problems/ransom-note/
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomMap = getMap(ransomNote);
        Map<Character,Integer> magazineMap = getMap(magazine);

        for(Map.Entry<Character,Integer> m: ransomMap.entrySet())
            if(!magazineMap.containsKey(m.getKey())||magazineMap.get(m.getKey())<m.getValue())return false;

        return true;
    }

    private Map<Character,Integer> getMap(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        return map;
    }
}