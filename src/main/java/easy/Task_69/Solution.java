package easy.Task_69;

import java.util.ArrayList;
import java.util.List;

// Sqrt(x)
// https://leetcode.com/problems/sqrtx/

public class Solution {
    public int mySqrt(int x) {
        Long result=0L;
        while (result*result<=x)result++;
        return result.intValue()-1;
    }
}