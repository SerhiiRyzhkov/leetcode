package easy.Task_2016;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Maximum Difference Between Increasing Elements
// https://leetcode.com/problems/maximum-difference-between-increasing-elements
public class Solution {
    public int maximumDifference(int[] nums) {
        int result=-1;
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums.length;j++)
                if((i<j)&&(nums[j]-nums[i]>0)&&(nums[j]-nums[i]>result))
                    result = nums[j] - nums[i];

                    return result;
    }
}