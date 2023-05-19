package easy.Task_2190;


import java.util.*;


// Most Frequent Number Following Key In an Array
//https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
public class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> map = new HashMap<>();

        int target=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==key){
                target=nums[i+1];
                if(map.containsKey(target))map.put(target,map.get(target)+1);
                else map.put(target,1);
            }
        }

        return map.entrySet().stream().max((el1,el2)->el1.getValue() > el2.getValue()?1:-1).get().getKey();
    }
}