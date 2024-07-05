package easy.Task_1002;

import java.util.*;
import java.util.stream.Collectors;

// Find Common Characters
// https://leetcode.com/problems/find-common-characters/
public class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result= new ArrayList<>();
        Map<String,Map<String,Integer>> map = new HashMap<>();
        Set<String> chars = new HashSet<>();


        for(String word: words){
            map.put(word,new HashMap<>());
            for(char ch: word.toCharArray()) {
                chars.add(String.valueOf(ch));
                map.get(word).merge(String.valueOf(ch), 1, Integer::sum);
            }
        }

        chars.forEach(el->{
            int min=Integer.MAX_VALUE;
            for(Map.Entry<String,Map<String,Integer>> m: map.entrySet()){
                if(!map.get(m.getKey()).containsKey(el))map.get(m.getKey()).put(el,0);
                min=Math.min(min,map.get(m.getKey()).get(el));
            }
            for(int i=0;i<min;i++)
                result.add(el);
        });

        return result;
    }
}