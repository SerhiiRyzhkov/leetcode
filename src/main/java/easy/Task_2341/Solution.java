package easy.Task_2341;


import java.util.*;


// Maximum Number of Pairs in Array
//https://leetcode.com/problems/maximum-number-of-pairs-in-array/
public class Solution {
    public int[] numberOfPairs(int[] nums) {
        int [] result = new int[2];
        Set<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                result[0]++;
                set.remove(nums[i]);
                result[1]--;
            }
            else
            {
            set.add(nums[i]);
            result[1]++;
            }
        }

        return result;
    }
}