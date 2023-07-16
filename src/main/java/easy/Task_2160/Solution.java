package easy.Task_2160;


import java.util.Arrays;

// Minimum Sum of Four Digit Number After Splitting Digits
// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
public class Solution {
    public int minimumSum(int num) {
        int [] arr = new int[4];
        for(int i=0;i<4;i++)
           arr[i]=Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
        Arrays.sort(arr);

        return arr[0]*10+arr[2]+arr[1]*10+arr[3];
    }
}