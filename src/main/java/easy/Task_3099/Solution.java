package easy.Task_3099;

// Harshad Number
// https://leetcode.com/problems/harshad-number/
public class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;

        for(int i=0;i<String.valueOf(x).length();i++)
            sum+=Character.getNumericValue(String.valueOf(x).charAt(i));

        return x%sum==0?sum:-1;
    }
}