package easy.Task_1694;


import java.util.HashMap;
import java.util.Map;

//  Reformat Phone Number
//  https://leetcode.com/problems/reformat-phone-number/
public class Solution {
    public String reformatNumber(String number) {

        StringBuilder sb = new StringBuilder();
        for(Character ch: number.toCharArray()) if(ch<58&&ch>47)sb.append(ch);
        number=sb.toString();
        sb=new StringBuilder();


        for(int i=0;i<number.length();i++)
        {
            int left = number.length()-i;
            if(left>4)
            sb.append(number.charAt(i++)).append(number.charAt(i++)).append(number.charAt(i)).append("-");
            else if (left==3)
                sb.append(number.charAt(i++)).append(number.charAt(i++)).append(number.charAt(i));
            else if(left==4)
                sb.append(number.charAt(i++)).append(number.charAt(i++)).append("-").append(number.charAt(i++)).append(number.charAt(i));
            else if(left==2)
                sb.append(number.charAt(i++)).append(number.charAt(i));
        }

        return sb.toString();
    }
}