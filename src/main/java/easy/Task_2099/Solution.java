package easy.Task_2099;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// Find Subsequence of Length K With the Largest Sum
//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/
public class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);
        while (list.size()!=k)
        {
           list.remove(Collections.min(list));
        }
        int [] result = new int[k];
        for(int i=0;i<list.size();i++)
            result[i]=list.get(i);
        return result;
    }
}