package easy.Task_2566;

//Maximum Difference by Remapping a Digit
//https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/
public class Solution {
    public int minMaxDifference(int num) {
        String max = String.valueOf(num);
        String min = String.valueOf(num);


        for(int i=0;i<max.length();i++)
            if(max.charAt(i)!='9') {
                max=max.replace(max.charAt(i), '9');
                break;
            }
        for(int i=0;i<min.length();i++)
            if(max.charAt(i)!='0')
            {
                min=min.replace(min.charAt(i),'0');
                break;
            }

        return Integer.parseInt(max)-Integer.parseInt(min);
    }
}