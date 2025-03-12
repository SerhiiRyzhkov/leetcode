# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s easy to solve with Set container.
# Approach
<!-- Describe your approach to solving the problem. -->
We create set container and write down there all the numbers should be picked. Then we iterate over the array from the end to begin and delete each element from Set until the container is empty. We count each operation and return count var in the end.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> set= new HashSet<>();
        int count=0;

        for(int i=1;i<=k;i++)
            set.add(i);

        for(int i=nums.size()-1;!set.isEmpty();i--)
        {
            set.remove(nums.get(i));
            count++;
        }

        return count;
    }
}
```