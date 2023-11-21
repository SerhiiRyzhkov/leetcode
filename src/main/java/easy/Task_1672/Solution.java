package easy.Task_1672;


import java.util.Arrays;

//  Richest Customer Wealth
//  https://leetcode.com/problems/richest-customer-wealth/
public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;

        for(int [] ar:accounts)
            if(Arrays.stream(ar).sum()>max)max=Arrays.stream(ar).sum();

        return max;
    }
}


