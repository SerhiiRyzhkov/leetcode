package easy.Task_3110;

import java.util.Map;

// Score of a String
// https://leetcode.com/problems/score-of-a-string/
public class Solution {
    public int scoreOfString(String s) {
        int result = 0;

        for(int i=1;i<s.length();i++)
            result+= Math.abs(s.charAt(i-1)-s.charAt(i));

        return result;
    }
}