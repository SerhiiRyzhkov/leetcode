package easy.Task_598;


import java.util.Arrays;

// Range Addition II
// https://leetcode.com/problems/range-addition-ii/
public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)return m*n;

        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;

        for (int[] op : ops) {
            a = Math.min(a, op[0]);
            b = Math.min(b, op[1]);
        }
        return a*b;
    }
}