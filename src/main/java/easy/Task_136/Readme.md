# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Set contains only unique elements, so it is going to help us.
# Approach
<!-- Describe your approach to solving the problem. -->
We add every element to set container. If Set already has the element, method add() returns false. It means that element is not unique. And we have to remove it from set. After the iteration over the array the set has the only one element. And this element is unique. And we have to return it. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) if (!set.add(num)) set.remove(num);
        return set.stream().findFirst().get();
    }
}
```