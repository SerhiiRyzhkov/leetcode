package easy.Task_1422;

import java.util.*;


// Maximum Score After Splitting a String
// https://leetcode.com/problems/maximum-score-after-splitting-a-string/
public class Solution {
    public int maxScore(String s) {
        int max=0;

        Map<Integer,List<Integer>> map = new HashMap<>();
        map.put(0,new ArrayList<>());
        map.put(1,new ArrayList<>());

        for(int i = 0;i<s.length();i++)
            if(s.charAt(i)=='1')map.get(1).add(i);
        else map.get(0).add(i);


        for(int i=1;i<s.length();i++)
        {
            int current_sum=0;
            for(int j=0; j<map.get(0).size()&&map.get(0).get(j)<i;j++)
                current_sum++;

            for(int j=map.get(1).size()-1;j>=0&&map.get(1).get(j)>=i;j--)
                current_sum++;

            max=Math.max(current_sum,max);
        }

        return max;
      }
}
