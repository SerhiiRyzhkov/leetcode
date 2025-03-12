package easy.Task_3105;

// Longest Strictly Increasing or Strictly Decreasing Subarray
// https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
public class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing = 1;
        int increasingMax = 1;
        int decreasing = 1;
        int decreasingMax = 1;


        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
                increasing++;
            else
                increasing=1;

            if(nums[i]<nums[i-1])
                decreasing++;
            else
                decreasing=1;

            increasingMax=Math.max(increasingMax,increasing);
            decreasingMax=Math.max(decreasingMax,decreasing);
        }

        return Math.max(increasingMax,decreasingMax);
    }
}