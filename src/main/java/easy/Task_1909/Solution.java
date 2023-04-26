package easy.Task_1909;


import java.util.*;

//Remove One Element to Make the Array Strictly Increasing
//https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean removed = false;
        for(int i=1;i<nums.length;i++)
            if(nums[i] <= nums[i-1]) {
                if(removed) return false;
                removed = true;
                if (i>1 && nums[i] <= nums[i-2])
                    nums[i] = nums[i-1];
            }

        System.out.println(Arrays.toString(nums));
        return true;
    }
}