package easy.Task_2717;

import java.util.*;

// Semi-Ordered Permutation
// https://leetcode.com/problems/semi-ordered-permutation/
public class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int result = 0;

        for(int i =0;i<nums.length-1;i++)
        {
            if(nums[nums.length-1]==nums.length)break;
            if(nums[i]==nums.length) {
                int temp = nums[i + 1];
                nums[i+1]=nums[i];
                nums[i]=temp;
                i--;
                result++;
            }
        }

        for(int i=1;i<nums.length;i++)
        {
            if(nums[0]==1)break;
            if(nums[i]==1){
                int temp = nums[i-1];
                nums[i-1]=nums[i];
                nums[i]=temp;
                i=i-2;
                result++;
            }
        }

        return result;
    }
}