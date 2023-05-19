# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It will be easier to work with input array if we transform it to a list.
# Approach
<!-- Describe your approach to solving the problem. -->
We transform the input array to a list. Then we remove the minimal value of the list until list`s size() is equals to k. Then all that we need is to transform the list back to an array and return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);
        while (list.size()!=k)
        {
           list.remove(Collections.min(list));
        }
        int [] result = new int[k];
        for(int i=0;i<list.size();i++)
            result[i]=list.get(i);
        return result;
    }
}
```