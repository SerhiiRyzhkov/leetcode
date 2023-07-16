package easy.Task_1189;

import java.util.*;

//  Maximum Number of Balloons
//  https://leetcode.com/problems/maximum-number-of-balloons/
public class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<text.length();i++)
            map.put(text.charAt(i), map.containsKey(text.charAt(i)) ? map.get(text.charAt(i)) + 1 : 1);

        String example = "balloon";

        int max = Integer.MAX_VALUE;

        for(int i = 0;i<example.length();i++)
        {
            char ch = example.charAt(i);
            if(!map.containsKey(ch))return 0;
            if((ch=='l')||(ch=='o'))
                max= Math.min(max, map.get(ch)/2);
            else max=Math.min(max, map.get(ch));
        }

        return max;
        }
    }