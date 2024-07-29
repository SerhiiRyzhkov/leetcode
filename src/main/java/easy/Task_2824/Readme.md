# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The fastest and the easiest way to resolve the problem is inner loop and check all elements with each other.
# Approach
<!-- Describe your approach to solving the problem. -->
We create iterate over the list using inner loop and check all elements with each other. Using count var we count pairs, in addition, we exclude cases when i==j and others from the task description.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int i =0; i<nums.size();i++)
            for(int j=0;j<nums.size();j++)
                if(i < j && nums.get(i) + nums.get(j) < target)count++;

        return count;
    }
}
```