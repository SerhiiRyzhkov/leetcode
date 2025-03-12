package easy.Task_3028;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Ant on the Boundary
// https://leetcode.com/problems/ant-on-the-boundary/
public class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int position = 0;
        int result =0;
        for (int num : nums) {
            position += num;
            if (position == 0) result++;
        }


        return result;
    }
}