package easy.Task_2278;


import java.util.HashMap;
import java.util.Map;


// Percentage of Letter in String
//https://leetcode.com/problems/percentage-of-letter-in-string/
public class Solution {
    public int percentageLetter(String s, char letter) {
        double count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==letter)count++;
        return (int)(100*count/s.length());
    }
}