# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The only obvious way to resolve the problem is bruteforce
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input array and check each number with other ones. 
1 step) We find the first digit of the first number (using String substring method)
2 step) We find the last digit of the second number using % operator.
3 step) We search for gsd of two numbers. We create d var and increment it until it equals to the min value of two numbers. Max value we use to find gsd. If after iterating d var, max = 1, it means that numbers are beautiful, and we have to increment count var. 
At the end we return count var.  
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
                if(i<j)
                {
                 int a=Integer.parseInt(String.valueOf(nums[i]).substring(0,1));
                 int b = nums[j]%10;
                    int max=1;
                    int d=max;
                    while (d<=Math.max(a,b))
                    {
                        if((a%d==0)&&(b%d==0))max=d;
                        d++;
                    }
                    if(max==1)count++;
                }
        }
        return count;

    }
}
```