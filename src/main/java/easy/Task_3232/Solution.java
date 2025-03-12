package easy.Task_3232;

import java.util.Arrays;

// Smallest Number With All Set Bits
// https://leetcode.com/problems/smallest-number-with-all-set-bits/
public class Solution {
    public boolean canAliceWin(int[] nums) {
       return Arrays.stream(nums).filter(el->el<10).sum()!=Arrays.stream(nums).filter(el->el>9).sum();
    }
}