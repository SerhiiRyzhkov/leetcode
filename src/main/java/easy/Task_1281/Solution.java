package easy.Task_1281;


import java.util.Arrays;

//  Subtract the Product and Sum of Digits of an Integer
//  https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class Solution {
    public int subtractProductAndSum(int n) {
        int sum=Character.getNumericValue(String.valueOf(n).charAt(0));

        int product=Character.getNumericValue(String.valueOf(n).charAt(0));

        for(int i=1;i<String.valueOf(n).length();i++)
        {
            int d = Character.getNumericValue(String.valueOf(n).charAt(i));
            sum+=d;
            product*=d;
        }

        return product-sum;
    }
}