package easy.Task_2144;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// Minimum Cost of Buying Candies With Discount
// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
public class Solution {
    public int minimumCost(int[] cost) {
        int result=0;
        Arrays.sort(cost);
        int index=cost.length-1;
        while (index>=2)
        {
            result+=cost[index]+cost[index-1];
            index-=3;
        }

        for(int i=0;i<=index;i++)
            result+=cost[i];
        return result;
    }
}