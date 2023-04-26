package easy.Task_748;

import java.util.*;

//Shortest Completing Word
//https://leetcode.com/problems/shortest-completing-word/
public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        List<String> suitable = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<licensePlate.length();i++) {
         char ch = licensePlate.charAt(i);
            if ((ch > 64)&&(ch<91)) {
                if(map.containsKey((char) (ch + 32)))
                    map.put((char) (ch + 32),map.get((char) (ch + 32))+1);
                else map.put((char) (ch + 32),1);
            }
            if ((ch > 96)&&(ch<123)) {
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else map.put(ch,1);
            }
        }

        for (String s : words) {
            char[] word = s.toCharArray();
            Map<Character, Integer> wordMap = new HashMap<>();
            for (char c : word) {
                if (wordMap.containsKey(c)) wordMap.put(c, wordMap.get(c) + 1);
                else wordMap.put(c, 1);
            }
            boolean suits = true;
            for (Character el : map.keySet()) {

                if ((!wordMap.containsKey(el)) || (wordMap.remove(el) < map.get(el))) {
                    suits = false;
                    break;
                }
            }
            if (suits)
                suitable.add(s);
        }



        suitable.sort(Comparator.comparingInt(String::length));

        return suitable.get(0);
    }
}
