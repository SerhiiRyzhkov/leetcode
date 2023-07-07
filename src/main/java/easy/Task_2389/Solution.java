package easy.Task_2389;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  Longest Subsequence With Limited Sum
//  https://leetcode.com/problems/longest-subsequence-with-limited-sum/
public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int [] result = new int[queries.length];
        Arrays.sort(nums);

        int index=0;
        while (index<result.length) {
            int a = 0;
            int count =0;
            for (int num : nums) {
                if (a + num <= queries[index]) {
                    a += num;
                    count++;
                } else break;
            }
            result[index++] = count;
        }
        return result;
    }
}