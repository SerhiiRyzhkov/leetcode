package easy.Task_2869;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Minimum Operations To Collect Elements
// https://leetcode.com/problems/minimum-operations-to-collect-elements/
public class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> set= new HashSet<>();
        int count=0;

        for(int i=1;i<=k;i++)
            set.add(i);

        for(int i=nums.size()-1;!set.isEmpty();i--)
        {
            set.remove(nums.get(i));
            count++;
        }

        return count;
    }
}