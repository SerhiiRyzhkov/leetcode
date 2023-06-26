package easy.Task_231;

// Power of Two
// https://leetcode.com/problems/power-of-two/
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return Long.bitCount(n)==1;
    }
}