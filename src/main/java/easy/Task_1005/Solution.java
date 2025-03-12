package easy.Task_1005;

import java.util.*;

// Maximize Sum Of Array After K Negations
// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length&&k!=0;i++)
        {
            if(nums[i]<0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        int sum = Arrays.stream(nums).sum();
        int min = Arrays.stream(nums).min().getAsInt();

        return (k%2==0)?sum:sum-min*2;
    }
}