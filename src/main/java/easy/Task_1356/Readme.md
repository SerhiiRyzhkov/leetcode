# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Obviously, we need bitCount method of Integer class.
# Approach
<!-- Describe your approach to solving the problem. -->
We transform the int[] to Integer[]. Now we are able to use comparator. We create comparator with bitCount method, and using stream API we sort the array. Then, all we need is transform the array back to primitive type and return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nLogN)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer [] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(array, (o1, o2) -> {
            if(Integer.bitCount(o1)==Integer.bitCount(o2)) return o1.compareTo(o2);
            return Integer.bitCount(o1)-Integer.bitCount(o2);
        });
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }
}
```