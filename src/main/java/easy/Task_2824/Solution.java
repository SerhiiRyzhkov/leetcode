package easy.Task_2824;

import java.util.Arrays;
import java.util.List;

// Count Pairs Whose Sum is Less than Target
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
public class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int i =0; i<nums.size();i++)
            for(int j=0;j<nums.size();j++)
                if(i < j && nums.get(i) + nums.get(j) < target)count++;

        return count;
    }
}