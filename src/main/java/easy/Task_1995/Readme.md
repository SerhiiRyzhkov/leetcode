# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The best way not to do a code long it`s better to resolve the problem with bruteforce and few loops.
# Approach
<!-- Describe your approach to solving the problem. -->
We create count var. Then we create 4 loops (each loop means a,b,c,d). Then we check all the combinations. And if the combination of the elements suits us we increment var count. It`s not the fastest way to resolve the problem, but it is quite brief and easy.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n4)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        for(int a=0;a<nums.length-3;a++)
        {
            for(int b=a+1;b<nums.length-2;b++)
            {
                for(int c=b+1;c<nums.length-1;c++)
                {
                    for(int d=c+1;d<nums.length;d++)
                    {
                        if(nums[a]+nums[b]+nums[c]==nums[d])
                            count++;
                    }
                }
            }
        }
        return count;
    }
}
```