package easy.Task_1486;


import java.util.Arrays;


// XOR Operation in an Array
// https://leetcode.com/problems/xor-operation-in-an-array/
public class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;

        while (--n>=0) result = result ^ (start + 2 * n);
        return result;
    }
}