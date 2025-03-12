package easy.Task_3370;

// Smallest Number With All Set Bits
// https://leetcode.com/problems/smallest-number-with-all-set-bits/
public class Solution {
    public int smallestNumber(int n) {
        while ((n&(n+1))!=0)n++;
    return n;
    }
}