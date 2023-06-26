package easy.Task_2027;

import java.util.Arrays;

// Minimum Moves to Convert String
// https://leetcode.com/problems/minimum-moves-to-convert-string/
public class Solution {
    public int minimumMoves(String s) {
        int result=0;
        int index =0;

        while (index<s.length())
        {
            if(s.charAt(index)=='O') {
            index++;
            }
            else {
                index+=3;
                result++;
            }
        }

        return result;
    }
}