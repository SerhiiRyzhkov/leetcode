package easy.Task_2748;

// Number of Beautiful Pairs
// https://leetcode.com/problems/number-of-beautiful-pairs/
public class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++) {
                int a =nums[i];
                while (a>10)a%=10;

                int b = nums[j] % 10;
                int max = 1;
                int d = max;
                while (d <= Math.min(a, b)) {
                    if ((a % d == 0) && (b % d == 0)) max = d;
                    d++;
                }
                if (max == 1) count++;
            }
        }
        return count;

    }
}