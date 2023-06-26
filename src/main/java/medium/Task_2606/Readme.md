# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
According to the fact, that we have to find subarray with max sum, it`s obvious that we have to use Kadane’s Algorithm.
# Approach
<!-- Describe your approach to solving the problem. -->
We separate solution to two parts:
1)We have build array with cost values of elements from the s string. If val contains the element - we add it`s value, else we calculate the value using char value of the element.
2)We have to find a substring with the largest sum and return this sum. We use Kadane’s Algorithm to resolve thar. If the maximum sum is less than 0, we return 0, else we return the sum.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {

    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int [] costs = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int cost=0;
            char ch = s.charAt(i);
            if(chars.indexOf(ch)==-1) cost=ch-96;
            else cost=vals[chars.indexOf(ch)];
            costs[i]=cost;
        }
        
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here =0;

        for(int i=0;i<costs.length;i++){
            max_ending_here=max_ending_here+costs[i];
            if(max_so_far<max_ending_here)
                max_so_far=max_ending_here;
            if(max_ending_here<0)
                max_ending_here=0;
        }
        return Math.max(0,max_so_far);

    }
}
```