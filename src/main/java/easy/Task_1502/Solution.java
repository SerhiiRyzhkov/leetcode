package easy.Task_1502;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// Can Make Arithmetic Progression From Sequence
//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int delta = arr[1]-arr[0];
        for(int i = 1;i<arr.length;i++)
            if(arr[i]-arr[i-1]!=delta)return false;


        return true;
    }
}