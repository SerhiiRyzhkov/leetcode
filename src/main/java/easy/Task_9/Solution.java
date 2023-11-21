package easy.Task_9;

import java.util.HashMap;
import java.util.Map;

// Palindrome Number
// https://leetcode.com/problems/palindrome-number/
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        StringBuilder reverse = new StringBuilder().append(x).reverse();
        return String.valueOf(x).equals(reverse.toString());
    }
}