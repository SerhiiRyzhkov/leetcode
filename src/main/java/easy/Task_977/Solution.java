package easy.Task_977;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array/
public class Solution {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(el->(int)Math.pow(el,2)).sorted().toArray();
    }
}