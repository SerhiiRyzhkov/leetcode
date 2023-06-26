package medium.Task_2606;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find the Substring With Maximum Cost
// https://leetcode.com/problems/find-the-substring-with-maximum-cost/
public class Solution {

    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int [] costs = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int cost=0;
            char ch = s.charAt(i);
            if(chars.indexOf(ch)==-1) cost=ch-96;
            else cost=vals[chars.indexOf(ch)];
            costs[i]=cost;
        }

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here =0;

        for(int i=0;i<costs.length;i++){
            max_ending_here=max_ending_here+costs[i];
            if(max_so_far<max_ending_here)
                max_so_far=max_ending_here;
            if(max_ending_here<0)
                max_ending_here=0;
        }
        return Math.max(0,max_so_far);

    }
}