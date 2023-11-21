package easy.Task_495;


import java.util.Arrays;

// Teemo Attacking
// https://leetcode.com/problems/teemo-attacking/
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result=0;

        for(int i=1;i<timeSeries.length;i++)
            result+=Math.min(timeSeries[i]-timeSeries[i-1],duration);

        return result+duration;
    }
}