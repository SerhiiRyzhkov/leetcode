package easy.Task_594;


import java.util.Arrays;

// Longest Harmonious Subsequence
// https://leetcode.com/problems/longest-harmonious-subsequence/
public class Solution {
    public int findLHS(int[] nums) {
        int max = 0;
        int count =1;
        int index = 0;
        boolean flag=false;
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++)
        {
            if(Math.abs(nums[i]-nums[index])<=1)
            {
                count++;
                if(nums[i]!=nums[index])flag=true;
            }
            else {
                if((count>1)&&(count>max)&&(flag))max=count;
                flag=false;
                count=1;
                i=++index;
            }
        }
        if((count>1)&&(count>max)&&(flag))max=count;
        return max;
    }
}