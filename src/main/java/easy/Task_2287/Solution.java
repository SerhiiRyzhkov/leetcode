package easy.Task_2287;


import java.util.HashMap;

import java.util.Map;


// Rearrange Characters to Make Target String
//https://leetcode.com/problems/rearrange-characters-to-make-target-string/
public class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer>map = new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }


        while (!map.isEmpty()) {
            for (int i = 0; i < target.length(); i++) {
                char ch = target.charAt(i);
                if (map.containsKey(ch)) {
                    if (map.get(ch) == 0) return count;
                    map.put(ch, map.get(ch) - 1);
                } else {
                    return count;
                }
            }
            count++;
        }

        return count;
    }
}