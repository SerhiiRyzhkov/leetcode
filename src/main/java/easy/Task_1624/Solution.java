package easy.Task_1624;


import java.util.*;

//  Largest Substring Between Two Equal Characters
//  https://leetcode.com/problems/largest-substring-between-two-equal-characters/
public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result=0;
        Map<Character,List<Integer>>map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.putIfAbsent(s.charAt(i),new ArrayList<>());
            map.get(s.charAt(i)).add(i);
        }
        if(map.size()==s.length())return -1;

        for(Map.Entry<Character,List<Integer>> m: map.entrySet())result=Math.max(result,m.getValue().get(m.getValue().size()-1)-m.getValue().get(0)-1);

        return result;

    }
}