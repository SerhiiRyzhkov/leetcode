package easy.Task_1893;

import java.util.Arrays;

// Check if All the Integers in a Range Are Covered
// https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
public class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left;i<=right;i++){
            boolean flag=false;
            for (int[] range : ranges) {
                int start = range[0];
                int end = range[1];
                if ((start <= i) && (end >= i)) {
                    flag = true;
                    break;
                }
            }
            if(!flag)return false;
        }
        return true;
    }
}

