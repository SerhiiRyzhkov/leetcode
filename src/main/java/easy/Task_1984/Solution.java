package easy.Task_1984;

import java.util.Arrays;

//Minimum Difference Between Highest and Lowest of K Scores
//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
public class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length<k)return 0;
        Arrays.sort(nums);
        int l=0;
        int min = nums[l+k-1]-nums[l];
        while (l<nums.length-k+1){
            if((nums[l+k-1]-nums[l])<min)min=nums[l+k-1]-nums[l];
            l++;
        }

        return min;
    }
}