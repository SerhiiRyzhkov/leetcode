package easy.Task_1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Minimum Subsequence in Non-Increasing Order
// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer>result = new ArrayList<>();
        int [] sorted = Arrays.stream(nums).sorted().toArray();
        int index = nums.length-1;
        int total=0;

        int sum = Arrays.stream(sorted).sum();

        while (total<=sum-total) {
            total += sorted[index];
            result.add(sorted[index--]);
        }

        return result;
    }
}