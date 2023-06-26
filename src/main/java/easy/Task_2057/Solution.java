package easy.Task_2057;

//Smallest Index With Equal Value
//https://leetcode.com/problems/smallest-index-with-equal-value/
public class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(nums[i]==i%10)return i;
        return -1;
    }
}