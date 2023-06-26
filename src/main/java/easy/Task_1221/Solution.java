package easy.Task_1221;

//  Split a String in Balanced Strings
//  https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class Solution {
    public int balancedStringSplit(String s) {
        int countL=0;
        int countR=0;
        int result=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')countR++;
            if(s.charAt(i)=='L')countL++;
            if((countL==countR)&&(countL!=0)){
                result++;
                countL=0;
                countR=0;
            }
        }
        return result;
    }
}