package easy.Task_697;

import java.util.*;

// Degree of an Array
// https://leetcode.com/problems/degree-of-an-array/
public class Solution {
    public int findShortestSubArray(int[] nums) {

        // Integer - [first appearance, last appearance, amount]

        TreeMap<Integer, int []> map = new TreeMap<>();
        int degree = 0;
        int element = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], new int[]{i,i,1});
            else map.put(nums[i], new int[]{map.get(nums[i])[0],i,map.get(nums[i])[2]+1});
            if(map.get(nums[i])[2]>degree)
            {
                degree=map.get(nums[i])[2];
                element=nums[i];
            }
            if((map.get(nums[i])[2]==degree)&&(
                    (map.get(nums[i])[1]-map.get(nums[i])[0])<
                            (map.get(element)[1]-map.get(element)[0])))
            {
                degree=map.get(nums[i])[2];
                element=nums[i];
            }
        }

         return map.get(element)[1]-map.get(element)[0]+1;
    }
}
