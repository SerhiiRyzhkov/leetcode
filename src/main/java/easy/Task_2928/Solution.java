package easy.Task_2928;

import java.util.*;

// Distribute Candies Among Children I
// https://leetcode.com/problems/distribute-candies-among-children-i/
public class Solution {
    public int distributeCandies(int n, int limit) {
        int result =0;
        for(int i=0;i<=limit;i++)
            for(int j=0;j<=limit;j++)
                for(int k=0;k<=limit;k++)
                    if(i+j+k==n)result++;
        return result;
    }
}