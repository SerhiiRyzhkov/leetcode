package easy.Task_461;



// Hamming Distance
// https://leetcode.com/problems/hamming-distance/
public class Solution {
    public int hammingDistance(int x, int y) {

        return Integer.bitCount((~x^~y));
    }
}