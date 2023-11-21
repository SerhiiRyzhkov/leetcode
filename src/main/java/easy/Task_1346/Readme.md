# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should use Set container to search in the array an element described in the task.
# Approach
<!-- Describe your approach to solving the problem. -->
We create HashSet container. Then we iterate over the array and check if in the set container we keep element * 2 or element / 2. If we do, we return true, else we just put the element to HashSet. Condition j%2==0 we need to exclude cases when element is odd. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr)
            if (set.contains(j * 2) || j%2==0 && set.contains(j / 2)) return true;
            else set.add(j);


        return false;
    }
}
```