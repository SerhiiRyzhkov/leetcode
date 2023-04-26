package easy.Task_1945;

import java.util.ArrayList;
import java.util.List;

//Sum of Digits of String After Convert
//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
public class Solution {
    public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
            sb.append(s.charAt(i)-96);


        for(int i=0;i<k;i++)
        {
            sb=convert(sb);
        }
        return Integer.parseInt(sb.toString());


    }
    public StringBuilder convert(StringBuilder sb){
        int sum=0;
        for(int i=0;i<sb.length();i++)
            sum+=Character.getNumericValue(sb.charAt(i));

        return new StringBuilder().append(sum);
    }

}