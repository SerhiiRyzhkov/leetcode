package easy.Task_169;

import java.util.HashMap;
import java.util.Map;

// Majority Element
// https://leetcode.com/problems/majority-element/
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
            if (map.get(num) > nums.length / 2) return num;
        }
        return -1;
    }
}