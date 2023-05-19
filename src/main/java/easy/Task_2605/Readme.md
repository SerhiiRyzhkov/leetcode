# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Using set may be very comfortable to get Solution
# Approach
<!-- Describe your approach to solving the problem. -->
We find minimum of each array. Then using Set retainAll() method we check if two arrays have the intersection? If true, the result is the min element of the intersection. If false we have to create result integer. It`s convenient to do with Math.min() and Math.max().
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {

        int min1 = Arrays.stream(nums1).min().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        set1.retainAll(set2);
        if(set1.size()>0) return set1.stream().mapToInt(el->el).min().getAsInt();
        else return Math.min(min1,min2)*10+Math.max(min1,min2);
    }
}
```