package easy.Task_888;

import java.util.*;

// Fair Candy Swap
// https://leetcode.com/problems/fair-candy-swap/
public class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();

        for (int alice : aliceSizes)
            for (int bob : bobSizes)
                if (aliceSum-bobSum==(alice-bob)*2) return new int[]{alice, bob};

        return null;
    }
}