package easy.Task_2652;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//Sum Multiples
//https://leetcode.com/problems/sum-multiples/
public class Solution {
    public int sumOfMultiples(int n) {

        int result =0;
        for(int i=0;i<=n;i++)
            if((i%3==0)||(i%5==0)||(i%7==0))result+=i;

        return result;
    }
}