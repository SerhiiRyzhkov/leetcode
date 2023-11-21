package easy.Task_1619;


import java.util.Arrays;

//  Mean of Array After Removing Some Elements
//  https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
public class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int skip = arr.length / 20;
        int sum = 0;
        int amount = 0;
        for (int i = skip; i < arr.length - skip; i++) {
            sum += arr[i];
            amount++;
        }
        return (double) sum/amount;
    }
}