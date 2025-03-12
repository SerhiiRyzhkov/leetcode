package easy.Task_1009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  Complement of Base 10 Integer
//  https://leetcode.com/problems/complement-of-base-10-integer/
public class Solution {
    public int bitwiseComplement(int n) {
        int result = 0;
        char[] arr = Integer.toBinaryString(n).toCharArray();

        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='0')result+=Math.pow(2,count);
            count++;
        }

        return result;
    }
}