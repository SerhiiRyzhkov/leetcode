package easy.Task_2600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// K Items With the Maximum Sum
// https://leetcode.com/problems/k-items-with-the-maximum-sum/description/
public class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        int index=0;

        for(int i=index;i<numOnes&&i<k;i++)
            sum++;

        index=numOnes+numZeros;

        for(int i=index;i<numZeros+numOnes+numNegOnes&&i<k;i++)
            sum--;

        return sum;
    }
}