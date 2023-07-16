package medium.Task_1218;

import java.util.*;

// Longest Arithmetic Subsequence of Given Difference
// https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
public class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 1;

        for (int a : arr) {
            if (map.containsKey(a - difference)) map.put(a, map.get(a - difference) + 1);
            else map.put(a, 1);
            result = Math.max(result, map.get(a));
        }
            return result;
    }
}