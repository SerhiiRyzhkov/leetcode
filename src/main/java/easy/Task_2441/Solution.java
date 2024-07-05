package easy.Task_2441;

import java.util.*;
import java.util.stream.Collectors;

// Largest Positive Integer That Exists With Its Negative
// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/
public class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = -1;
        for(Integer i: set)if((Math.abs(i)>max)&&(set.contains(-1*i)))max=Math.abs(i);

        return max;
    }
}