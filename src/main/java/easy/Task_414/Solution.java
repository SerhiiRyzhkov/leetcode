package easy.Task_414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// Third Maximum Number
// https://leetcode.com/problems/third-maximum-number/
public class Solution {
    public int thirdMax(int[] nums) {
        int[] distinct = Arrays.stream(nums).distinct().sorted().toArray();
        return distinct.length > 2 ? distinct[distinct.length - 3] : distinct[distinct.length - 1];
    }
}