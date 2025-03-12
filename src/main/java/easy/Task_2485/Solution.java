package easy.Task_2485;

// Find the Pivot Integer
// https://leetcode.com/problems/find-the-pivot-integer/
public class Solution {
    public int pivotInteger(int n) {
        int left=0;
        int right=0;

        for(int i=1;i<=n;i++)
            right+=i;

        for(int i=1;i<=n;i++)
        {
            left=left+i;
            right=right-(i-1);
            if(right==left)return i;
        }

        return -1;
    }
}