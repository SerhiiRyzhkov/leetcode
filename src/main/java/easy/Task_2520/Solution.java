package easy.Task_2520;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Count the Digits That Divide a Number
// https://leetcode.com/problems/count-the-digits-that-divide-a-number/
public class Solution {
    public int countDigits(int num) {
        int result = 0;
        for (Character ch: String.valueOf(num).toCharArray())
            if(num%Character.getNumericValue(ch)==0)result++;
        return result;
    }
}