package easy.Task_2399;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//  Check Distances Between Same Letters
//  https://leetcode.com/problems/check-distances-between-same-letters/
public class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),i);
            else map.put(s.charAt(i),i-map.get(s.charAt(i))-1);



        for(int i=0;i<distance.length;i++)
        {
            if(!map.containsKey((char)(i+97)))continue;
            if(map.get((char)(i+97))!=distance[i])return false;
        }


        return true;
    }
}