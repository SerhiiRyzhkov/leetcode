package easy.Task_2220;


import java.util.ArrayList;
import java.util.List;


// Minimum Bit Flips to Convert Number
// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
public class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start^goal);

    }
}