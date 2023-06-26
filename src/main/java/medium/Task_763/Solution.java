package medium.Task_763;

import java.util.*;

// Partition Labels
// https://leetcode.com/problems/partition-labels/
public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>result = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
        else map.put(s.charAt(i),map.get(s.charAt(i))+1);

        int count=0;

        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            set.add(ch);
            map.put(ch,map.get(ch)-1);
            count++;
            if (set.stream().filter(el->map.get(el)>0).toList().size()==0){
                result.add(count);
                count=0;
            }
        }

        return result;
    }
}