package easy.Task_3024;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

// Type of Triangle
// https://leetcode.com/problems/type-of-triangle/
public class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) return "none";
        return switch ((int)(Arrays.stream(nums).distinct().count())){
            case 1 -> "equilateral";
            case 2 -> "isosceles";
            default -> "scalene";
        };
    }
}