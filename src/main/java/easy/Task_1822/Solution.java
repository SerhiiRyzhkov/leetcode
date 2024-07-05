package easy.Task_1822;

import java.util.Arrays;
import java.util.stream.Stream;

// Sign of the Product of an Array
// https://leetcode.com/problems/sign-of-the-product-of-an-array/description/
public class Solution {
    public int arraySign(int[] nums) {
       int result = 1;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) result *= -1;
        }
           return result;
    }
}