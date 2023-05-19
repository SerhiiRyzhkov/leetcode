package easy.Task_470;


import java.util.Arrays;

// Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/
public class Solution {
    public int[] shuffle(int[] nums, int n) {

        if(nums.length==1)return nums;

        int[] result = new int[nums.length];
        int x=0;
        int y =nums.length/2;


        for (int i = 0; i < nums.length; i++){
            if(i%2==0) result[i]=nums[x++];
            else result[i]=nums[y++];
    }
        return result;
    }
}