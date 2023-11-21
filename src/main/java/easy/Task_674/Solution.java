package easy.Task_674;

import java.util.Arrays;

// Longest Continuous Increasing Subsequence
// https://leetcode.com/problems/longest-continuous-increasing-subsequence/
public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=1;
        int current =1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])current++;
            else {
                max=Math.max(current,max);
                current=1;
            }
        }

        return Math.max(current,max);
    }
}