package easy.Task_884;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

//Uncommon Words from Two Sentences
//https://leetcode.com/problems/uncommon-words-from-two-sentences/
public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String>result = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        List<String> list = new ArrayList<>(Arrays.stream(s1.split(" ")).toList());
        list.addAll(Arrays.stream(s2.split(" ")).toList());

        for (String s : list) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }

        for(Map.Entry<String,Integer> el: map.entrySet() )
            if(el.getValue()==1)result.add(el.getKey());

        return result.toArray(new String[0]);
        }
}