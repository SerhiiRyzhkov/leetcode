# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Regarding the fact we have to count only unique numbers, HashSet will help us to solve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We create Set container. It will help us to count prefix. Then we iterate over the array. We add every element to hashset and the size of the set container will be our prefix, before set contains only unique elements. To count suffix we use stream API. We take a part of the input array (subarray) after current element, and count amount of distinctive elements. The difference between prefix and suffix we write down to result.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int [] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            int prefix = set.size();
            int suffix = (int)
                    Arrays.stream(Arrays.copyOfRange(nums,i+1,nums.length)).distinct().count();
            result[i]=prefix-suffix;
        }

        return result;
    }
}
```