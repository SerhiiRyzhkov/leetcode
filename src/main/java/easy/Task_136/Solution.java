package easy.Task_136;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Single Number
// https://leetcode.com/problems/single-number/
public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) if (!set.add(num)) set.remove(num);
        return set.stream().findFirst().get();
    }
}