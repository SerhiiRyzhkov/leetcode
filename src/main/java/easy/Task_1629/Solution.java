package easy.Task_1629;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

//  Slowest Key
//  https://leetcode.com/problems/slowest-key/description/
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = Integer.MIN_VALUE;
        int prev = 0;
        int index=0;

        for(int i=0;i<releaseTimes.length;i++)
        {
            if((releaseTimes[i]-prev >max)||(releaseTimes[i]-prev==max)&&(keysPressed.charAt(index)<keysPressed.charAt(i)))
            {
                index=i;
                max=releaseTimes[i]-prev;
            }
            prev=releaseTimes[i];
        }

        return keysPressed.charAt(index);
    }
}