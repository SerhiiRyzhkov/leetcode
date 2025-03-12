package easy.Task_1200;

import java.util.*;

//  Minimum Absolute Difference
//  https://leetcode.com/problems/minimum-absolute-difference/
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++)
            min=Math.min(min,arr[i]-arr[i-1]);

        List<List<Integer>> result = new ArrayList<>();

        for(int i=1;i<arr.length;i++)
            if(arr[i]-arr[i-1]==min)result.add(new ArrayList<>(List.of(arr[i-1],arr[i])));
        return result;
    }
}