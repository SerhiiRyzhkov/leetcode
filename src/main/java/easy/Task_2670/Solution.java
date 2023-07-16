package easy.Task_2670;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Find the Distinct Difference Array
// https://leetcode.com/problems/find-the-distinct-difference-array/
public class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int [] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            int prefix = set.size();
            int suffix = (int)
                    Arrays.stream(Arrays.copyOfRange(nums,i+1,nums.length)).distinct().count();
            result[i]=prefix-suffix;
        }

        return result;
    }
}