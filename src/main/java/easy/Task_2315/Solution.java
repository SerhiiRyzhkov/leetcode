package easy.Task_2315;


//Count Asterisks
//https://leetcode.com/problems/count-asterisks/
public class Solution {
    public int countAsterisks(String s) {
        boolean flag = false;
        int result =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|')flag=!flag;
            if((!flag)&&(s.charAt(i)=='*'))result++;
        }

        return result;
    }
}